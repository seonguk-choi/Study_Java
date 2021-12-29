package pack01_nestedClass;

public class A {
	//A a = new A();
	public A() {
		System.out.println("A가 생성 되었습니다.");
	}
	
	//A의 인스턴스 멤버(인스턴스 클래스)
	
	public class B{
		int field1;
		void bMethod() {
			System.out.println("B의 메소드입니다.");
		}
		public B() {
			System.out.println("B가 생성되었습니다.");
		}
	}//B의 멤버 구역
	
	//A의 정점 멤버(Static멤버)
	public static class C {
		public C() {
			System.out.println("C가 생성되었습니다.");
		}
		int field1;
		static int field2;
		void method1() {
			System.out.println("C의 메소드");
		}
		static void method2() {
			System.out.println("C의 메소드");
		}
	}//C의 멤버 구역
	
	//A의 인스턴스 멤버(메소드)
	void aMethod() {
		int a = 0; //로컬변수 == 로컬 클래스
		//로컬 클래스
		class D{
			int feild1;
			//static feild2; 왜 안될까? : 로컬변수는 블록안에서 다 사라진다.
			void method1() {
				System.out.println("D의 메소드가 호출됨");
			}
			public D() {
				
			}
		}
		D d = new D();
		d.feild1 = 10;
		d.method1();
	}
}//Class↑ static이 안붙어있으면 전부 인스턴스 멤버(인스턴스화 해야 접근가능)
