package pack03_extends;

public class CellPhoneMain {
	public static void main(String[] args) {
		SmartCellPhone dcp = new SmartCellPhone("dmb폰", "검정", 1,"5G");
		dcp.powerOn();//CellPhone에 구현되어있는 메소드
		dcp.bell();
		dcp.sendVoice("여보세요?");
		dcp.receiveVoice("보험사 입니다. 보험 가입하실래요?");
		dcp.hangup();
		System.out.println(dcp.model);
		System.out.println(dcp.color);
		//부모클래스에 구현되어있는 기능들을 상속받아 사용해봄.
		dcp.turnOnDmb();//DmbCellPhone
		dcp.changeChannelDmb(10);
		dcp.turnOffDmb();
		
		//SmartCellPhone 자식클래스를 만든다.
		//기능 DmbCellPhone + CellPhone + SmartCellPhone 
		//3세대 핸드폰
		//field = String internetSpd = "4G / 5G";
		//인터넷에 접속하는 메소드 + 4 , 5 G의 속도로 인터넷을 시작합니다.
		//유튜브를 키는 메소드
		//인터넷을 끄는 메소드
		//유튜브를 끄는 메소드
		System.out.println(dcp.internetSpd);
	}
}
