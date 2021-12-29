package pack04_override;

public class SubClass extends SuperClass {
	
	@Override
	public void printName() {
		System.out.println("");
	}
	public void printName(String name) {
		System.out.println(name + "이름을 출력합니다.");
	}
}
