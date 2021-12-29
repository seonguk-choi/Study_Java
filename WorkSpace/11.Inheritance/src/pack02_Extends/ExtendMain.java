package pack02_Extends;

//1. 상속 방법 : class(자식) extends(상속을 의미) class(부모)
//2. 자식클래스는 부모클래스로부터 정의되어있는 멤버들을 사용 가능하다.
//	 부모클래스는 자식클래스에 구현되어있는 멤버들을 사용할 수 없다.
//3. 자식클래스는 여러 부모클래스를 상속받지 못 한다.(단일 상속만 가능)
//4. 부모클래스는 여러 자식클래스가 있을 수 있다.(자식클래스들이 상속을 받는 건
//	 자식클래스가 부모를 선택하는 것)
//5. 자식클래스가 더 다양한 기능이 가능하므로 자식클래스를 인스턴스화해서 
//	 사용하는것이 바람직함.(효울적임) 상속을 사용했다면 자식, 부모클래스를
//	 각각 따로 만드는 것은 매우 비효율적이다.
public class ExtendMain {
	public static void main(String[] args) {
		//Sub_Class만을 인스턴스화해서
		//SpuerClass기능과 SubClass기능을 전부 호출하세요.
		Sub_Class sc = new Sub_Class();
		int x = 10;
		int y = 2;
		sc.sum(x, y);
		sc.minus(x, y);
		sc.mul(x, y);
		sc.div(x, y);
		sc.div_re(x, y);
		System.out.println(sc.sum(x, y));
		System.out.println(sc.minus(x, y));
		System.out.println(sc.mul(x, y));
		System.out.println(sc.div(x, y));
		System.out.println(sc.div_re(x, y));
	}
}
