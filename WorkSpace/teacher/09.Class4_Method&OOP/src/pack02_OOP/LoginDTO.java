package pack02_OOP;
//실제 로그인 처리가 일어난후.
//LoginDTO에 회원의 정보가 담김.
//정보를 이용해서 마이페이지 , 권한 , ....
public class LoginDTO {
	String id;
	String pw;
	//반드시 LoginDTO를 생성할때 id,pw를 입력받아야만 .
	//비어있는 생성자 메소드를 사용할수없게 만들어야한다.==>id,pw를 입력받는 생성자 메소드를만든다.

	//↓파라메터를 입력받는 생성자메소드 생성시 비어있는 생성자메소드는 별도로 만들지 않으면
	//사용할수 없게됨.
	//LoginDTO dto = new LoginDTO(); <= 사용이 불가능해짐.
	public LoginDTO(String pw, String id) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public LoginDTO(int id , int pw) {
		
	}
	public LoginDTO(String id) {
		this.id = id;
	}
	

}
