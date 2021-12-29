package pack01_mavenjbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//데이터베이스와 연동하여 데이터를 가지고오고 보내고 전송을 할 수 있는 클래스
//1.연결 2.전송(파라메터도 전송) 3.결과(list구조의 결과, Resultset)
public class MemberDAO {
	int student_no = 99;
	private Connection con;//DB와 연결(전송로)을 하는 연결객체
	private PreparedStatement ps;//전송로를 통해서 어떠한 데이터를 주거나 받는 전송객체
								 //Update, Delete, Insert
	private ResultSet rs;		 //Select 결과를 받는 결과객체
	//ojdbc8 을 가져온 이유 <- lib oracle.jdbc.driver.OracleDriver <- 이용
	
	public void getConn() {
		//DB접속 정보가 필요함, url, userName, password
		String url = "jdbc:oracle:thin:@125.136.151.206:1521:XE";
		String user = "JavaTest";
		String password = "0000";
		
		//동적 클래스 로딩이 필요함.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			dbClose();
//			if(!con.isClosed()) {
//				System.out.println("열림");
//				ps = con.prepareStatement(
//						"select 1 as num from dual "
//						);
//				rs = ps.executeQuery();//전송객체가 DB에서 sql을 실행하고 결과를 가지고옴.
//				while(rs.next()) {
//					System.out.println(rs.getInt("num"));
//				}
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//1.Connection 전송로 만들고 전송로 통해서 ps 가 데이터를 이동시키는 처리
	//이동이 완료되면(ps) 3. 그 결과를 rs가 받는다.
	
	//DB연결을 닫을 때는 DB를 사용할 때의 역순으로 닫아주면 된다.
	//물탱크 -> 수도파이프 -> 물이 이동 -> 수도꼭지 돌림
	//수도꼭지돌림 -> 물 이동 멈춤 -> 수도파이프에 물이 안흐름
	public void dbClose() {
		try {//null.close();
			if(rs != null) {rs.close();}
			if(ps != null) {ps.close();}
			if(ps != null) {con.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public String rtnStr(String msg) {
		Scanner sc  = new Scanner(System.in);
		//공백문자를 제거하고 한글자 이상 입력했는지 체크.
		//3글자 이상 입력했는지 체크
		while(true) {
			System.out.println(msg);
			String inputData = sc.nextLine();
			if(inputData.trim().length() > 0) {
				return inputData;
			}
		}// 무한 반복문 아래 코드는 실행 될 수 없다, break가 없다면
	}
	
	
	public void memberJoin() {
		Scanner sc = new Scanner(System.in);
		//아이디 중복 확인 메소드가 필요함.
		String user_id = "";
		while(true) {
			user_id = rtnStr("아이디를 입력하세요");
			if(!idCheck(user_id)) {
				System.out.println("아이디가 중복되었습니다.");
			} else {
				break;
			}
		}
		String user_pw = rtnStr("비밀번호를 입력하세요");
		String firstname = rtnStr("성을 입력하세요");
		String lastname = rtnStr("이름을 입력하세요");
		//1.연결객체 2.전송객체 3.Select(ResultSet으로 받을 필요가 없다)
		String sql = "INSERT INTO user_tbl (STUDENT_NO, USER_ID, USER_PW, FIRSTNAME, LASTNAME)\r\n" + 
				"    VALUES           (?, ?, ?, ?, ?)";
		getConn();
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, student_no);
			ps.setString(2, user_id);
			ps.setString(3, user_pw);
			ps.setString(4, firstname);
			ps.setString(5, lastname);
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	//1, 0 || true, false, "OK", "NG", ....
	public boolean idCheck(String id) {
		//1.연결객체가 필요함.
		getConn();
		String sql = "select count(*) cnt from user_tbl where student_no = 99 and user_id = ?";
					 // ? == 오라클 문장 String 에 파라메터 추가하기
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				if(rs.getInt("cnt") == 1){
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return false;
	}
	
	public MemberDTO login(String id, String pw) {
		MemberDTO dto = null;
		getConn();
		String sql = "select * " + 
				"from user_tbl " + 
				"where student_no = ? " + 
				"and   user_id = ? " + 
				"and   user_pw = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, student_no);
			ps.setString(2, id);
			ps.setString(3, pw);
			rs = ps.executeQuery();
			while(rs.next()) {
				dto = new MemberDTO(student_no, rs.getString("user_id"),rs.getString("user_pw"), rs.getString("firstname"), rs.getString("lastname"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return dto;
	}

	public void updateMember(MemberDTO dto) {
		//1.연결 2.전송 3.결과(select일때는 rs 그외에는 int로 받으면 됨)
		getConn();
		String sql = "update user_tbl set user_pw = ?, firstname = ?, lastname = ?, update_ymd = sysdate " + 
				"where student_no = 99 and user_id = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, rtnStr("비밀번호"));
			ps.setString(2, rtnStr("이름"));
			ps.setString(3, rtnStr("성"));
			ps.setString(4, dto.getUser_id());
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
	}
}


