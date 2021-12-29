package Test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class NoticeDAO {
	private static Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;

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
		String sql = "select * from notice_tbl";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				String data = rs.getString("id");
				System.out.println(data + " 데이터가 있습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("connTest()에서 애러 발생!");
		} finally {
		    dbClose();
		}		
	}
	
	public void InsertNotice(NoticeDTO dto) {
		conn = getConn();
		String sql = "INSERT INTO notice_tbl(id, title, content, writer)\r\n" + 
				"VALUES (?, ?, ?, ?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getTitle());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getWriter());
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("InsertNotice()에서 애러 발생!");
		} finally {
			dbClose();
		}		
	}
	
	public void UpdateNotice(NoticeDTO dto) {
		conn = getConn();
		String sql = "UPDATE notice_tbl\r\n" + 
				"SET title = ?, content = ?, writer = ?" + 
				"WHERE id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getTitle());
			ps.setString(2, dto.getContent());
			ps.setString(3, dto.getWriter());
			ps.setString(4, dto.getId());
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("UpdateNotice()에서 애러 발생!");
		} finally {
			dbClose();
		}		
	}
	
	public void DeleteNotice(NoticeDTO dto) {
		conn = getConn();
		String sql = "DELETE FROM notice_tbl\r\n" + 
				"WHERE  id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getId());
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("connTest()에서 애러 발생!");
		} finally {
			dbClose();
		}		
	}
	
	public ArrayList<NoticeDTO> SelectNotice() {
		ArrayList<NoticeDTO> list = new ArrayList<>();
		conn = getConn();
		String sql = "select * from notice_tbl";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				NoticeDTO dto = new NoticeDTO(rs.getString("id"), rs.getNString("title"),
						                      rs.getString("content"), rs.getString("writer"));
				list.add(dto);
			}
			for (NoticeDTO dto : list) {
				System.out.println(dto.getId() + "\t" + dto.getTitle()+ "\t" +
			                       dto.getContent() + "\t" + dto.getWriter());
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("connTest()에서 애러 발생!");
		} finally {
			dbClose();
		}
		return list;
	}
	
	
}
