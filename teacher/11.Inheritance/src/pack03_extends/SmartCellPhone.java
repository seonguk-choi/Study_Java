package pack03_extends;

public class SmartCellPhone extends DmbCellPhone{
	String internetSpd ;
	public SmartCellPhone(String model, String color, int channel
				,String internetSpd) {
		super(model, color, channel);
		this.internetSpd = internetSpd;
	}
	
	@Override//anotation 기계가 알아볼수있는 주석
	void powerOn() {
		//super.powerOn();//부모클래쓰에 있는 메소드를 호출하고있다.
		//System.out.println("자식클래스의 기능추가");
		System.out.println("옆에있는 전원 버튼을 통해  전원을 ON했습니다.");
	}

}
