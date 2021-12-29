package pack02_extends;

// 1. 상속 방법 : class(자식) extends(상속을 의미) class(부모)
// 2. 자식클래스는 부모클래스로부터 정의 되어있는 멤버들을 사용 가능하다.
//부모 클래스는 자식클래스에 구현되어있는 멤버들을 사용할수가없다.
// 3. 자식클래스는 여러 부모 클래스를 상속받지 못한다. (단일 상속만 가능)
// 4. 부모클래스는 여러 자식 클래스가 있을수있다. (자식클래스들이 상속을 받는건
//자식클래스가 부모를 선택하는 것)
// 5. 자식 클래스가 더 다양한 기능이 가능하므로 자식 클래스를 인스턴스화 해서
//사용하는것이 바람직함.(효율적임) 상속을 사용했다면 자식,부모 클래스를
//각각 따로 만드는것은 매우 비효율적이다 .
public class ExtendMain {
	public static void main(String[] args) {
		//Sub_Class만을 인스턴스화해서 
		//SuperClass기능과 SubClass기능을 전부 호출하세요.
		Sub_Class sc = new Sub_Class();
		System.out.println(sc.div(5, 7));
		System.out.println(sc.div_re(5, 7));
		System.out.println(sc.sum(5, 7));
		System.out.println(sc.minus(5, 7));
		System.out.println(sc.mul(5, 7));
	
	}
}
