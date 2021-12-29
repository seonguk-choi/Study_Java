import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Database Access Object
//JDBC Java Database Connectivity
//(oracle, mysql, msql, mariaDb...)
public class Ex01_DAO2 {//실제 DB와 연동하여 요구사항 처리 후 리턴(main실행부로)
	private Connection conn; //연결객체 연결만한다.
	private PreparedStatement ps;
	private ResultSet rs; //결과객체
	//선언만 해둔 상태이기 때문에 모든 객체들은 null상태이다.
	//DB에 접속할 수 있는 접속 정보를 정의하고 Connection객체부터 차례대로 초기화를 시켜야함
	
	//Connection을 리턴하는 메소드를 만들어야한다.
	//리턴타입이 있는 (void가 아닌 메소드)
	//conn = Connection;
}
