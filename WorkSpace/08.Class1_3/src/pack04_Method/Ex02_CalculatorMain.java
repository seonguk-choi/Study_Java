package pack04_Method;

public class Ex02_CalculatorMain {
	public static void main(String[] args) {
		//인스턴스 멤버를 사용하기 위해서는. 반드시 인스턴스화(객체화)
		Ex02_Calculator cal = new Ex02_Calculator();//계산기 객체를 초기화
		cal.powerOn();
		//int x = 1000;
		//int y = 20;
		int result = cal.plus(50, 100);
		System.out.println("result:" + result);
		System.out.println(cal.mul(2, 5));
		System.out.println(cal.mul(1, 2 , 3));
		System.out.println((5/2));
		System.out.println((5.0/2.0));
		System.out.println(cal.divide(5, 2));
		//int를 return하는 메소드는 int형 변수라고 생각해도 무방하다.
	}
}
