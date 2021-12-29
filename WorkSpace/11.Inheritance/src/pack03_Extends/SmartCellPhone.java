package pack03_Extends;

public class SmartCellPhone extends DmbCellPhone{
	String internetSpd;

public SmartCellPhone(String model, String color, int channel, String internetSpd) {
		super(model, color, channel);
	}
	void turnOninternet(String internetSpd) {
		this.internetSpd = internetSpd;
		System.out.println(internetSpd + " 속도로 인터넷을 시작합니다.");
	}
	
	@Override//anotation 기계가 알아볼 수 있는 주석 지워도 상관 없다.
	void powerOn() {
		//super.powerOn();//부모클래스에 있는 메소드를 호출하고 있다.
		//System.out.println("자식클래스의 기능추가");
		System.out.println("옆에 있는 전원 버튼을 통해 전원을 ON했습니다.");
	}
	void turnOnyoutube() {
		System.out.println("유투브를 시작합니다.");
	}
	void turnOffinternet() {
		System.out.println("인터넷을 종료합니다.");
	}
	void turnOffyoutube() {
		System.out.println("유투브를 종료합니다.");
	}
}
