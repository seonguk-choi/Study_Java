package pack01_Interface;

public interface TestInterface {
	String SERVERIP = "192.168.0.10";
	void test1();//개발자1
	void test2();//개발자2
	void test3();//개발자3
	int DATA = 10;//우리눈에는 안보이지만 interface에서 변수의 선언은
				  //일반변수가아니라 final변수 (상수) 바꿀수없는 변수
}
