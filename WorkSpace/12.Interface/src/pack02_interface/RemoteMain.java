package pack02_interface;

public class RemoteMain {
	public static void main(String[] args) {
		Audio a = new Audio();
		a.turnOn();
		a.turnOff();
		a.setVolume(3); //개발 에러 : 0~10 MAX, MIN을 벗어남
		System.out.println(a.getVolume());
		//0~10 사이의 값이 들어오면 값을 셋팅한다(설계도를 이용할 것)
		//그외에 범위 값이 들어오면 기존에 있던 값을 그래도 유지 한다.
		a.setVolume(19);
		System.out.println(a.getVolume());
		a.setVolume(-10);
		System.out.println(a.getVolume());
		RemoteController rc; //null
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(1);
		rc = new TvClass();
		rc.turnOn();
		rc.turnOn();
		rc.setVolume(1);
		//rc.setTest();
		rc = new NewTv();
		rc.setChannel(-10);
		rc.setChannel(200);
		rc.setOs("Siri");
		rc.setOs("시리야");
		rc.setPlay("뽀로로");
		rc.setPlay("뽀로");
	}
}
