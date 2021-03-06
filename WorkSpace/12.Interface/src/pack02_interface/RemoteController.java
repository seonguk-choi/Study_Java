package pack02_interface;

//모든 개발자들이 참조해서 사용할 수 있는 리모콘의 설계도 Interface
public interface RemoteController {
	//상수
	int MAX_VOL = 10;
	int MIN_VOL = 0; //-를 사용할 수 없게 함.
	//모든 볼륨(RemoteController.i)를 implements받은 리모콘들은
	//0~10 사이의 볼륨만 사용할 것
	
	//추상 메소드 (메소드의 바디가 없고 이름과 데이터타입만 정의해놓은 것)
	//abstract
	void turnOn();//전원 on 가능
	void turnOff();//전원 off 가능
	void setVolume(int volume); //setter를 강제한다.
	void setChannel(int channel);
	void setOs(String order);
	void setPlay(String play);
	
	int MAX_CHA = 255;
	int MIN_CHA = 0;
	String ORDER = "Siri";
	String PLAY = "뽀로로";
	
	
}
