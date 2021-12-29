import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.util.ArrayList;

public class MemberDAO { // 실제 DB와 연동하여 요구사항 처리 후 리턴

	private Connection conn; // 연결객체

	private PreparedStatement ps; // 전송객체

	private ResultSet rs; // 결과객체 : select 문

	// DB접속 메소드
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		dao.conn = dao.getConn();
		dao.checkNum(1);
	}

	public Connection getConn() {

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";

		String user = "hanul";

		String password = "0000";

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver"); // 동적로딩

			conn = DriverManager.getConnection(url, user, password);
				
		} catch (Exception e) {

			e.printStackTrace();

			System.out.println("getConn() Exception!!!");

		}

		return conn;

	}// getConn()

	// DB종료 메소드 : conn, ps, rs → 역순으로 종료

	public void dbClose() {

		try {

			if (rs != null)
				rs.close();

			if (ps != null)
				ps.close();

			if (conn != null)
				conn.close();

		} catch (Exception e) {

			e.printStackTrace();

			System.out.println("dbClose() Exception!!!");

		}

	}// dbClose()

	// 번호검색 메소드

	public ResultSet checkNum(int num) {

		conn = getConn(); // DB접속

		// String sql = "select * from tblMember where num = " + num; //Statement

		String sql = "select 1 as num from dual "; // PreparedStatement

		try {

			ps = conn.prepareStatement(sql); // 전송객체

			ps.setInt(1, num); // 매개변수 값을 전달(세팅)

			rs = ps.executeQuery(); // 쿼리를 실행 후 결과가 저장된 객체
			while(rs.next()) {
				System.out.println(rs.getInt("num"));
			}
		} catch (Exception e) {

			e.printStackTrace();

			System.out.println("checkNum() Exception!!!");

		}

		return rs;

	}// checkNum()

	// 회원등록 메소드

	



}// class