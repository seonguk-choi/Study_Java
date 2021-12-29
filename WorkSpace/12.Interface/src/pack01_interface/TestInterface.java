package pack01_interface;

public interface TestInterface {
	String SEVERIP = "192.168.0.10";
	void test1();//개발자1이 구현
	void test2();//개발자2이 구현
	void test3();//개발자3이 구현
	int DATA = 10;//우리눈에는 안보이지만 interface에서 변수 선언은
				  //일반변수가 아니라 final변수 (상수) 바꿀수 없는 변수
	
	
}
