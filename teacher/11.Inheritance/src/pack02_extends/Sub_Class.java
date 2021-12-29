package pack02_extends;
//아직 부모클래스를 선택하지 않은 일반 클래스,
//부모클래스를 extends로 선택하게 되면 자식 클래스가 되며 부모클래스의 기능을
//가져올수있다. ( 현 -> sum , minus )
public class Sub_Class extends Super_Class {
	public int mul(int x , int y) {
		return x * y;
	}
	public int div(int x , int y) {
		return x / y ;
	}
	public int div_re(int x , int y) {
		return x % y ;
	}
}
