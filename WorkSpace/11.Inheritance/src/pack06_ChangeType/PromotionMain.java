package pack06_ChangeType;

public class PromotionMain {
	public static void main(String[] args) {
		A a = new A();//부모클래스
		B b = new B();//A의 자식클래스
		C c = new C();//A의 자식클래스
		D d = new D();//B의 자식클래스
		E e = new E();//C의 자식클래스
		//데이터를 표현할 수 있는 크기가 더 작은 것 -> 큰것
		//									큰 것 -> 작은 것
		// (int)
		e = (E) c; //큰 것 -> 작은 것
				   //정보의 일부가 제외된다(강제형변환)
	}
}
