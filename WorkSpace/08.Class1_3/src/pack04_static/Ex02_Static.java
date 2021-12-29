package pack04_static;

public class Ex02_Static {
	public static void main(String[] args) {
		display1();
		display2();
		Ex02_Static es = new Ex02_Static();
		es.display1();
	}
	//void display1() -> static void display1() static 멤버로 바뀜.
	static void display1() {
		System.out.println("화면 1번입니다.");
	}
	static void display2() {
		System.out.println("화면 2번입니다.");
	}
	static {
		System.out.println("static 초기화 블럭");
		//프로그램 시작전에 먼저 메모리 할당, 종료시 소멸
		//프로그램 시작전(메모리 공간차지) 프로그램 종료전까지 (메모리 공간차지)
		//실행속도가 느려짐.
		//static은 가급적 사용을 줄이는게 좋다.
	}
}
