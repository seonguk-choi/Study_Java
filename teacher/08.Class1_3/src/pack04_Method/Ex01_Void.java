package pack04_Method;

public class Ex01_Void {
	//인스턴스 멤버 ( 클래스의 블럭킹 사이에 있는 모든것들 , static이라는 키워드가 안들어간)
	//인스턴스화(클래스,객체화) 
	//Ex01_Void가 인스턴스화 객체화 되지 않으면 접근할수 없는 멤버를 뜻한다.
	int a ;
	//Method 의 선언 (정의) 
	//return타입 (데이터타입) 메소드의이름(의미있는 뜻을 넣어주는게 관례) 소괄호(){
	
	//}
	//void 또는 int,String(void가 아닌 데이터타입) methodName(){
	//}
	//1.main메소드는 return타입이 없다(void)
	//2.main메소드는 String[]배열을 인자값으로 받아서 실행을 한다.
	
	public static void main(String[] args) {
		Ex01_Void ex = new Ex01_Void(); //객체화 
		ex.printName();
		///String name = "이름";
		//ex.printName(name);
		ex.printName("이름");
	}
	//void == return타입이 없는(메소드가 실행 된 후에 어떠한 결과도 받지 못한다)
	void printName() {
		System.out.println("김영문");
	}
	void printName(String name) {
		System.out.println(name);
	}
	void printName(Ex01_Void voida) {
		System.out.println(voida);
	}
	//메소드의 이름이 같으나 파라메터의 갯수나 파라메터의 타입이 다른경우에는 
	//java프로그램이 메소드의 차이를 인식할수있으므로 같은이름의 메소드를 사용할수있는것.
	
	
	
}
