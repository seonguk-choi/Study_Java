package pack05_override_final;

public class Airplane {
//부모클래스(슈퍼)가 되는 일반 비행기(1세대) 객체
	public void land() {
		System.out.println("착륙합니다.");
	}
	public void fly() {
		System.out.println("일반 비행을 합니다.");
	}
	public void tackOff() {
		System.out.println("이륙합니다.");
	}
}
