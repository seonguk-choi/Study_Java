package pack04_static;

public class Ex02_StaticMain {
	public static void main(String[] args) {
		//Ex02_Static이라는 class에 있는 static멤버인 display1()메소드와
		//display2()메소드를 접근해서 출력
		Ex02_Static.display1();
		Ex02_Static.display2();
		//static 으로 되어있는 String ip변수 = 192.168.0.1
		//Ex02_Static.ip = 192.168.0.2;
		//static 단점: 값을 마음데로 바꿀 수 있다.
	}
}
