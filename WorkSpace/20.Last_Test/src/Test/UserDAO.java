package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserDAO {
	private static Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	Scanner sc = new Scanner(System.in);

	public Connection getConn() {
		String url = "jdbc:oracle:thin:@125.136.151.206:1521/xe";
		String user = "JavaTest";
		String password = "0000";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("getConn() 에러났음.");
		}
		return conn;
	}
	
	public void dbClose() {
		try {
			if(rs != null) {
				rs.close();
			}
			if(ps != null) {
				ps.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void connTest() {
		conn = getConn();
		String sql = "select * from user_tbl;";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				String data = rs.getString("student_no");
				System.out.println(data + " 데이터가 있습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("connTest()에서 애러 발생!");
		} finally {
		    dbClose();
		}		
	}

	boolean Login(UserDTO dto) {
		int cnt = 0;
		conn = getConn();
		String sql = "SELECT user_id, user_pw FROM  user_tbl WHERE user_id = ? AND user_pw = ?";
		try {
			while(true) {
				cnt++;
				ps = conn.prepareStatement(sql);
				dto.setUser_id(rtnString("아이디를 입력해주세요."));
				dto.setUser_pw(rtnString("비밀번호를 입력해주세요."));
				ps.setString(1, dto.getUser_id());
				ps.setString(2, dto.getUser_pw());
				rs = ps.executeQuery();
				while(rs.next()) {				
						System.out.println("로그인이 되었습니다.");
						return true;
				}if(cnt == 3) {
					System.out.println("3회 불일치로 프로그램을 종료합니다.");
					return false;
				}else {
					System.out.println("아이디 또는 비빌번호가 틀렸습니다.");
				}
			}
		} catch (Exception e) {
			System.out.println("Login에서 애러 발생! 프로그램 종료");
			return false;
		} finally {
		    dbClose();
		}
	}
	
	public void UpdateUser(UserDTO dto) {
		dto.setUser_pw(rtnUserPw(dto));
		conn = getConn();
		String sql = "UPDATE user_tbl SET user_pw = ?, firstname = ?, lastname = ?, update_ymd = SYSDATE WHERE student_no = 15";
		try {
			ps = conn.prepareStatement(sql);
			dto.setUser_pw(rtnString("수정할 비밀번호를 입력해주세요."));
			dto.setFirstname(rtnString("수정할 이름을 입력해주세요."));
			dto.setLastname(rtnString("수정할 성을 입력해주세요."));
			ps.setString(1, dto.getUser_pw());
			ps.setString(2, dto.getFirstname());
			ps.setString(3, dto.getLastname());
			int result = ps.executeUpdate();
			System.out.println(result);				    			    
			System.out.println("회원정보가 수정되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("UpdateUser()에서 애러 발생!");
		} finally {
			dbClose();
		}
	}
	
	public void DeleteUser(UserDTO dto) {
		int cnt = 0;
		conn = getConn();
		String sql = "DELETE FROM user_tbl WHERE  student_no = 15 AND USER_ID = ? AND USER_PW = ?";
		try {
			while(true) {
				cnt++;
				ps = conn.prepareStatement(sql);
				dto.setUser_id(rtnString("아이디를 입력해주세요."));
				dto.setUser_pw(rtnString("비밀번호를 입력해주세요."));
				ps.setString(1, dto.getUser_id());
				ps.setString(2, dto.getUser_pw());
				int result = ps.executeUpdate();
				System.out.println(result);
				if(result == 1) {
					System.out.println(dto.getUser_id() +" 님의 아이디가 삭제되었습니다.");
					break;
				}if(cnt == 3) {
					System.out.println("3회 불일치로 프로그램을 종료합니다.");
					break;
				}else {
					System.out.println("아이디 또는 비빌번호가 틀렸습니다.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DeleteUser에서 애러 발생!");
		} finally {
			dbClose();
		}
	}
	
	public void InsertUser(UserDTO dto) {
		dto.setUser_id(rtnUserId(dto));
		conn = getConn();
		String sql = "INSERT INTO user_tbl(student_no, user_id, user_pw, firstname, lastname, create_ymd) VALUES (15, ?, ?, ?, ?,  SYSDATE)";
		try {
			ps = conn.prepareStatement(sql);
			dto.setUser_pw(rtnString("비밀번호를 입력해주세요."));
			dto.setFirstname(rtnString("이름을 입력해주세요."));
			dto.setLastname(rtnString("성을 입력해주세요."));
			ps.setString(1, dto.getUser_id());
			ps.setString(2, dto.getUser_pw());
			ps.setString(3, dto.getFirstname());
			ps.setString(4, dto.getLastname());
			System.out.println(dto.getUser_id() +"님 가입을 축하드립니다.");
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("InsertUser에서 애러 발생!");
		} finally {
			dbClose();
		}
	}
	
	int rtnInt(String msg) {	
		int iData = 0;
		while (true) {
			try {
				System.out.println(msg);
				iData = Integer.parseInt(sc.nextLine());
				return iData;
			} catch (Exception e) {
				System.out.println("숫자만 입력이 가능합니다.");
			}
		}
	}
	
	String rtnString(String msg) {
		String sData;
		while (true) {
			try {
				System.out.println(msg);
				sData = sc.nextLine();
				if (sData.length() < 1 || sData.length() > 25) {
					System.out.println("한글자 이상, 25자 내외로 입력하세요.");
				} else {
					return sData;
				}
			} catch (Exception e) {
				System.out.println("rtnString에러");
			}
		}
	}	
		
	String rtnUserId(UserDTO dto) {
		conn = getConn();
		String sql = "SELECT COUNT(*) FROM user_tbl WHERE user_id = ? HAVING COUNT(*) >= 1";
		try {
			while(true) {
				ps = conn.prepareStatement(sql);
				dto.setUser_id(rtnString("아이디를 입력해주세요."));
				ps.setString(1, dto.getUser_id());
				int result = ps.executeUpdate();
				System.out.println(result);
				if(result == 1) {
					System.out.println("중복되는 아이디입니다.");	
				}else {
					System.out.println("사용가능한 아이디입니다.");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("rtnUserId에서 애러 발생!");
		} finally {
			dbClose();
		}
		return dto.getUser_id();
	}	

	String rtnUserPw(UserDTO dto) {
		conn = getConn();
		String sql = "SELECT COUNT(*) FROM user_tbl WHERE user_pw = ? HAVING COUNT(*) >= 1";
		try {
			while(true) {
				ps = conn.prepareStatement(sql);
				dto.setUser_id(rtnString("비밀번호를 입력해주세요."));
				ps.setString(1, dto.getUser_pw());
				int result = ps.executeUpdate();
				System.out.println(result);
				if(result == 1) {
					System.out.println("비밀번호가 일치합니다.");
					break;
				}else {
					System.out.println("비밀번호가 틀립니다.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("rtnUserPw에서 애러 발생!");
		} finally {
			dbClose();
		}
		return dto.getUser_pw();
	}	
	
}
