import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//Database Access Object
//JDBC Java Database Connectivity
//(oracle, mysql, msql, mariaDb.....)
//
public class Ex01_DAO {//실제 DB와 연동하여 요구사항 처리 후 리턴(main실행부로)
	private static Connection conn; //연결객체 연결만한다.
	private PreparedStatement ps; //전송객체
	private ResultSet rs; //결과객체
	//선언만 해둔 상태이기 때문에 모든 객체들은 null상태이다.
	//DB에 접속할 수 있는 접속 정보를 정의하고 Connection객체부터 차례대로 초기화를 시켜야함.
	
	//Connection을 리턴하는 메소드를 만들어야한다.
	//리턴타입이 있는 (void가 아닌 메소드)
	//conn = Connection;
	//DB접속 메소드
	public Connection getConn() {
		//url(아이피정보, 포트정보, 오라클 버전정보)
		//user(계정의 이름) ex) hanul
		//password = ex) 0000
		//ojdbc8 <- 동적 클래스 로딩하는 로직이 필요함.
		//oracle.jdbc.driver.OracleDriver <- 연결되어있는지 빨리 확인하는 방법.
		//hanul	hanul@//192.168.0.12:1521/xe : oracle dev -> 새접속클릭 -> 접속세부정보 복사
		//String url = "jdbc:oracle:thin:@localhost:1521:xe"; //localhost
		//String url = "jdbc:oracle:thin:@192.168.0.12:1521:xe";//ip주소
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "hanul";
		String password = "0000";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			//임시로 테스트할 코딩을 추가 연결테스트
//			if(conn.isClosed()) {
//				System.out.println("연결이 닫힘");
//			} else {
//				System.out.println("연결이 안닫힘");
//			}
//			conn.close();
//			if(conn.isClosed()) {
//				System.out.println("연결이 닫힘");
//			} else {
//				System.out.println("연결이 안닫힘");
//			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("getConn() 에러났음.");
		}
		return conn;
	}
	
		//리턴타입이 없는(void인 형태의 메소드)
		//작업순서(정순) : 접속(conn), 전송(ps), 결과(rs)
		//종료순서(역순) : 결과객체 비우기(닫기), 전속객체 닫기, 접속객체 닫기
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
			//전송시 필요한 것 (sql문) == String
			//전송객체를 접속객체를 이용해서 초기화 시켜야함.
			conn = getConn(); //DB접속이 가능하게 Connection conn 객체를 초기화 시키기.
			String userData1 = "choiData1";
			String userData2 = "choiData2";
			//String sql = "select '" + userData + "' data from dual";
			//↑구버젼 방법 어떤 파라메터를 오라클까지 전송하기에 매우 불편하다.
			String sql = "select 'choi' data1 from dual";
			//select 'kymData' as data1, ? as data2 from dual
			try {
				ps = conn.prepareStatement(sql); //전송객체는 반드시 접속객체 안에서 초기화
				ps.setString(1, userData1); //오라클시작은 1번
				ps.setString(2, "test");
				rs = ps.executeQuery();
				while(rs.next()) {
					//data를 받는 방법( dataGethering )
					//int num = rs.getInt("num");
					String data1 = rs.getString("data1");
					String data2 = rs.getString("data2");
					System.out.println(data1 + " 데이터가 있습니다.");
					System.out.println(data2 + " 데이터가 있습니다.");
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("connTest()에서 애러 발생!");
			} finally {
				//1.접속 2.전송객체를 통해 sql문 보냄 3.결과객체에 전송객체를 출력
				//4. 연결을 해제한다.
			    dbClose();
			}		
		}
		public void memberSelect() {
			conn = getConn();//접속 객체를 메소드를 이용하여 초기화.
			String sql = "select * from tblMember";
			try {
				ps = conn.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()) {
					System.out.print(rs.getString("num") + "\t");
					System.out.print(rs.getString("name") + "\t");
					System.out.print(rs.getString("age") + "\t");
					System.out.print(rs.getString("addr") + "\t");
					System.out.println(rs.getString("tel"));
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("getConn() 에러났음.");
			} finally {
				dbClose();
			}
		}
			public ArrayList<Ex01_DTO> memberSelect1() {
				ArrayList<Ex01_DTO> list = new ArrayList<>();
				conn = getConn();//접속 객체를 메소드를 이용하여 초기화.
				String sql = "select * from tblMember";
				try {
					ps = conn.prepareStatement(sql);
					rs = ps.executeQuery();
					//전송객체가 쿼리를 실행하고 그 결과를 rs에 담음
					while(rs.next()) {
						Ex01_DTO dto = new Ex01_DTO(rs.getInt("num"), rs.getString("name"), rs.getInt("age"), rs.getString("addr"), rs.getString("tel"));
						list.add(dto);
					}
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("getConn() 에러났음.");
				} finally {
					dbClose();
				} 
				return list;
	}
}
