package pack06_Type;

public class Ex01_Casting {
	public static void main(String[] args) {
		byte byteData = 10; // byte 타입 변수를 선언, 값을 할당 -> 초기화
		//byte 범위 -128 ~ 127(작은변수)
		
		int intData = byteData;
		//int 범위 억단위 ( byte 보다 큰 변수)
		//큰 변수에 작은 변수를 담게 되면 자동으로 타입이 바뀐다.
		//형변환 byte -> int ▶ 묵시적 형변환 (upCasting)
		System.out.println(intData);
	
		int intData2 = 1000000000;
		double doubleData = intData2;
		System.out.println(doubleData);
		
		byte byteData2 = 0;
		double doubleData2 = byteData2;
		System.out.println(doubleData2);
		
		//================================자동형변환
		
		int c ; //int형 변수 c를 선언
		double d = 37.9; // double형 변수 d를 초기화(선언과 동시에 할당)
		//int 는 허용범위 중간단위, double은 가장 큰 단위
		//DownCasting 방법
		//일반적으로 할당하는 방법과 같으나 할당 부분 앞에 "데이터 타입 명시"
		c = (int) d;
		System.out.println("변수 c의 값 : " +c);
		System.out.println("변수 d의 값 : " +d);
		
		//int형 데이터 타입을 가진 변수 x를 선언과 동시에 값을 할당 127;
		//byte형 데이터타입을 가진 변수 y를 만들고 y에 x값을 할당해서 DownCasting
		
		int x = -130;
		byte y = (byte) x;
		System.out.println("변수 x의 값 : " +x);
		System.out.println("변수 y의 값 : " +y);
		//=======================================강제 타입변환
		
		
		
		
		
		
	}
}
