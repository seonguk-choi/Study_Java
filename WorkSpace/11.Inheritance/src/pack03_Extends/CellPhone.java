package pack03_Extends;

public class CellPhone {
	//필드
	public String model; //핸드폰 기종
	public String color; //핸드폰 색상
	
	//기본 기능들.(일반 핸드폰(구))
	void powerOn() {
		System.out.println("종료 버튼을 눌러서 전원을 ON했습니다.");
	}
	void powerOff() {
		System.out.println("전원을 OFF했습니다.");
	}
	void bell() {
		System.out.println("전화 벤이 울립니다.(전화옴)");
	}
	void sendVoice(String msg) {
		System.out.println("나(본인) : " + msg);
	}
	void receiveVoice(String msg) {
		System.out.println("상대방(타인) : " + msg);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
