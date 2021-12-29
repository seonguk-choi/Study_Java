package pack09_protected;

import pack08_protected.A;
import pack08_protected.B;
//Protected 상속을 강제한다 , 상속을 받지않은 다른패키지 클래스에서는
//사용이 불가능하게 막는것.
//A클래스를 사용하기위해서는 같은 패키지 내에서 상속받은 B라는 객체 (자식클래스)
//
public class C extends A{
	public static void main(String[] args) {
		B b = new B();
		b.method2();//public
		b.init();
	}
}
