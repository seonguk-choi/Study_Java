package pack03_Constructor;

public class Ex01_Korean {
	//필드(속성) 
	String nation = "대한민국"; 
	String name ;//null
	String ssn ; //null
	//생성자 메소드 만드는 규칙 Class의 이름을 똑같이 써주고 소괄호() 블럭킹을 열어주는것{}
	//Ex01_Korean(){
	//	기본 생성자 메소드 ex) Ex01_Korean kor = new Ex01_Korean();
	//}
	//public Ex01_Korean() {
		//기본 생성자 메소드  ( 별도로 선언하지 않아도 컴파일러(JVM) 에서 만들어줌 )
		//※단 하나라도 매개변수를 가지는 생성자 메소드를 개발자가 만드는순간 자동으로 안만들어줌
	//}
	
	//생성자 메소드 오버로딩 - 메소드의 이름이 같으면 원래 사용이 불가능하나.
	//매개변수의 타입이나 , 갯수를 달리해서 같은이름으로 사용할수있게 하는 기능
	//ex)메소드의 이름이 같은상태에서 매개변수 갯수까지 같으면 어떤 메소드를 호출한지
	//pc는 알수가없다.
	public Ex01_Korean() {
		
	}
	public Ex01_Korean(String n ,String b) {
		//Ex01_Korean kor = new Ex01_Korean("이름값");
		//this 키워드
		this.name = n;
		this.ssn = b;
	}
	public Ex01_Korean(String n ) {
		this.name = n;
	}
	public Ex01_Korean(int a) {
		
	}
	
	//생성자 메소드
	//Ex01_Korean(매개 변수) {
		//필드의 초기화가 일어나는 부분.
	//}
	
}
