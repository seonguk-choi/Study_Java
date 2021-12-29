package pack02_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductDAO {
	//디비 접속에 필요한 접속객체, 전송에 필욯나 전송객체, 전송객체를 통해
	//결과를 받는 결과 객체
	private static Connection conn; //연결객체 연결만한다.
	private PreparedStatement ps; //전송객체
	private ResultSet rs; //결과객체

	public Connection getConn() {

		String url = "jdbc:oracle:thin:@192.168.0.12:1521/xe";
		String user = "hanul";
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
				//NullPointerException
				//를 가장 쉽게 회피(예외처리) 하는 방법.
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
		String sql = "select * from tblMember";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				String data = rs.getString("");
				System.out.println(data + " 데이터가 있습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("connTest()에서 애러 발생!");
		} finally {
		    dbClose();
		}		
	}
	public void InsertMember() {

		conn = getConn();
		String sql = "INSERT INTO tblMember(num, name, age, addr, tel)\r\n" + 
				"VALUES (5, '최성욱', 32, '광주시 서구 쌍촌동', '010-3865-2153')";
		try {
			ps = conn.prepareStatement(sql);
			//데이터를 조작하게되면 (select x)
			//행의 삽입(추가), 행의 수정, 행의 삭제
			int result = ps.executeUpdate();//Table Update 결과1 = 성공, 그 외값은 실패
							   //0 , -1, Mybatis(=<)
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("connTest()에서 애러 발생!");
		} finally {
		    dbClose();
		}		
	}
	public void InsertMember(MemberDTO dto) {
		conn = getConn();
		String sql = "INSERT INTO tblMember(num, name, age, addr, tel)\r\n" + 
				"VALUES (?, ?, ?, ?, ?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dto.getNum());
			ps.setString(2, dto.getName());
			ps.setInt(3, dto.getAge());
			ps.setString(4, dto.getAddr());
			ps.setString(5, dto.getTel());
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("connTest()에서 애러 발생!");
		} finally {
			dbClose();
		}		
	}
	public void UpdateMember(MemberDTO dto) {
		conn = getConn();
		String sql = "UPDATE tblmember\r\n" + 
				"SET name = ?, age = ?, addr = ? , tel = ?" + 
				"WHERE num = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setInt(2, dto.getAge());
			ps.setString(3, dto.getAddr());
			ps.setString(4, dto.getTel());
			ps.setInt(5, dto.getNum());
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("connTest()에서 애러 발생!");
		} finally {
			dbClose();
		}		
	}
	public void DeleteMember(MemberDTO dto) {
		conn = getConn();
		String sql = "DELETE FROM tblMember\r\n" + 
				"WHERE  num = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dto.getNum());
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("connTest()에서 애러 발생!");
		} finally {
			dbClose();
		}		
	}
	
	public void SelectMember(MemberDTO dto) {
		ArrayList<MemberDTO> list = new ArrayList<>();
		conn = getConn();
		String sql = "INSERT INTO tblMember(num, name, age, addr, tel)\r\n" + 
				"VALUES (?, ?, ?, ?, ?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dto.getNum());
			ps.setString(2, dto.getName());
			ps.setInt(3, dto.getAge());
			ps.setString(4, dto.getAddr());
			ps.setString(5, dto.getTel());
			int result = ps.executeUpdate();
			System.out.println(result);
			rs = ps.executeQuery();
			while(rs.next()) {
				dto = new MemberDTO(rs.getInt("num"), rs.getNString("name"), rs.getInt("age"),
						                      rs.getString("addr"), rs.getString("tel"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("connTest()에서 애러 발생!");
		} finally {
			dbClose();
		}		
	}
}
