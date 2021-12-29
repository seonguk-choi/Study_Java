package pack02_Interface;

//모든 개발자들이 참조해서 사용할수있는 리모콘의 설계도 Interface
public interface RemoteController {
	//상수
	//int VOLUME = 0; <-설계에러 
	int MAX_VOL = 10;
	int MIN_VOL = 0 ; //-를 사용할수없게함 
	//모든 볼륨(RemoteController.i)를 implements받은 리모콘들은
	//0~10사이의 볼륨만 사용할것
	
	//추상 메소드 (메소드의 바디가 없고 이름과 데이터타입만 정의해놓은것)
	//abstract
	void turnOn();//전원 ON 기능
	void turnOff();//전원OFF
	void setVolume(int volume);//setter를 강제한다.
	
}
