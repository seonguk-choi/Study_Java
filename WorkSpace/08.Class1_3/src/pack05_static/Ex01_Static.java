package pack05_static;

public class Ex01_Static {
	int x = 5;
	int y = 10; //<<--
	static int z = 50;
	//static이 안붙었으면 무조건 인스턴스 멤버 다.
	//인스턴스 멤버에서 static멤버 접근은 자유롭게 가능하다.
	//static멤버에서 인스턴스 멤버 변수에는 자유롭게 접근이 불가능함.
	//static멤버가 먼저 메모리에 올라가야하는데 인스턴스 멤버들은 인스턴스화(객체화)
	//되어있지 않으면 메모리에 올라갈수없기때문에 ..
	public static void main(String[] args) {
		System.out.println(x); // <- 인스턴스 멤버는 인스턴스화 되어야지 메모리에 올라가는데
							   //바로 접근하기때문에 static은 메모리에 올라갈수없는 에러.
		System.out.println(z);
		
	}
	void main2() {
		System.out.println(x);
		System.out.println(z);
	}
}
