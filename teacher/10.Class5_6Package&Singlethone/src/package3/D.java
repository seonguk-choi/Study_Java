package package3;

public class D {
	//private 접근제한자 
	//메소드 , 변수(field) 인스턴스 또는 static 멤버에 붙는 접근제한자.
	D d1 = new D(1);//o
	D d2 = new D("2");//o
	D d3 = new D();//o
	public D(int num) {	}
	D(String data) { }//눈으로 확인은 안되지만 별도의 접근제한자를
	//지정하지않으면 그 접근제한자가 default이다.
	private D() {}
	//같은 소스 내에서만 접근을 허용한다.
	
}
