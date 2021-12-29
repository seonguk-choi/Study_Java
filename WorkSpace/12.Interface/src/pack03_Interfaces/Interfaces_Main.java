package pack03_Interfaces;

import pack01_interface.TestInterface;
import pack02_interface.RemoteController;

//extends (다중상속을 지원 안함)
//implements (다중상속을 지원함)
public class Interfaces_Main implements TestInterface, RemoteController{
	@Override
	public void test1() {
		System.out.println("test1입니다.");
	
	}

	@Override
	public void test2() {
	
	}

	@Override
	public void test3() {
	
	}

	@Override
	public void turnOn() {
		System.out.println("전원을 켜는 메소드");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setChannel(int channel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setOs(String order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlay(String play) {
	}
	int volume;
	static Interfaces_Main ims = new Interfaces_Main(); //방법 1
	public static void main(String[] args) { //객체화 이유 : 객체의 메소드를 사용하기 위해서
		Interfaces_Main im = new Interfaces_Main(); //방법 2
		im.test1();
		im.turnOn();
		//↑ 주로 사용
		ims.test1();
		ims.turnOn();
		//↑ 메모리를 많이 차지한다.
		
	}
}

