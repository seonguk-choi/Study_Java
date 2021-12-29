package pack04_static;

public class Ex01_Static {
	int x = 5;
	int y = 10;
	//static이 안붙으면 무조건 인스턴스 멤버
	//인스턴스 멤버에서 Static 멤버 접근은 자유롭게 가능
	//static멤버에서 인스턴스 멤버 변주에는 자유롭게 접근 불가능
	//static멤버가 먼저 메모리에 올라가야하는데 인스턴스 멤버들은 인스턴스화(객체화)
	//되어있지 않으면 메모리에 올라 갈 수 없기 때문이다.
	static int z = 50;
	
	public static void main(String[] args) {// static member
		Ex01_Static es = new Ex01_Static(); //인스턴스화
		System.out.println(es.x);//<- 인스턴스 멤버는 인스턴스화 되야 메모리에 올라가는데
		System.out.println(z);	//바로 접근 하는 Static에는 올라 갈 수 없다.
		//멤버의 구분이 다르다.
		
	}
	
	void main2() {
		System.out.println(x);
		System.out.println(z);
	}
}
