package pack02_OOP;
//실제 로그인 기능이 들어가는곳.
public class LoginDAO {
	
	//메소드는 return타입이 없으면 반환받을 값이 필요없으면 void
	//return타입이 필요하다면 void가 아닌 내가 필요한 데이터타입으로 만들면됨.
	boolean login(LoginDTO dto) {
		//boolean = true & false 두가지 값밖에 가지고 있을 수 없다.
		if(dto.id.equals("hong") && dto.pw.equals("1234")) {
			//System.out.println("로그인이되었습니다.");
			return true;
		}
		return false;
	}
	boolean login(String id ,String pw) {
		if(id.equals("hong") && pw.equals("1234")) {
			return true;
		}
		return false;
	}
}
