package pack01_Extends;
//extends가 사용되기 전엔 각각 다른 클래스임, Parent & Child
//extends를 이용해서 자식클래스가 부모클래스를 고르게 되면(명시하게 되면)
//그때는 부모와 자식 클래스가 된다.
public class Child_Class extends Parent_Class {
	String child_field = "자식클래스 iv";
	public void childMethod() {
		System.out.println("자식클래스의 메소드");
	}
}
