package pack04_Override;

public class SubClass extends SuperClass{
	@Override
	public void printName() {
		//super.printName();
		System.out.println("서브 이름을 출력합니다");
	}
	public void printName(String name) {
		System.out.println(name + " 이름을 출력합니다.");
	}
}
