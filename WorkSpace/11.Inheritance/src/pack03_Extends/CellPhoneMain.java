package pack03_Extends;

public class CellPhoneMain {
	public static void main(String[] args) {
		DmbCellPhone dcp = new DmbCellPhone("dmb폰", "검정", 1);
		dcp.powerOn();//CellPhone에 구현되어 있는 메소드
		dcp.bell();
		dcp.sendVoice("여보세요?");
		dcp.receiveVoice("보험사입니다. 보험 가입하실래요?");
		dcp.hangUp();
		System.out.println(dcp.model);
		System.out.println(dcp.color);
		//부모클래스에 구현되어있는 기능들을 상속받아 사용해봄.
		System.out.println("=============");
		dcp.turnOnDmb();//DmbCellPhone
		dcp.changeChannelDmb(10);
		dcp.turnOffDmb();
		System.out.println("=============");
		SmartCellPhone scp = new SmartCellPhone("SmartPhone", "purple", 1, "5G");
		scp.turnOninternet("5G");
		scp.turnOnyoutube();
		scp.turnOffinternet();
		scp.turnOffyoutube();
		scp.turnOnDmb();
		scp.changeChannelDmb(10);
		scp.turnOffDmb();
		scp.powerOn();
		scp.bell();
		scp.sendVoice("여보세요?");
		scp.receiveVoice("자기세요?");
		scp.hangUp();
		scp.powerOff();
		System.out.println(scp.model);
		System.out.println(scp.color);
	}
}
