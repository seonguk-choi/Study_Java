package pack06_Type;

public class Ex01_Casting {
	public static void main(String[] args) {
		//우리는 항상 이곳에 작업을 합니다.
		byte byteData = 10; //byte타입에 변수를 선언과 동시에 값을할당==초기화
		//byte -128 ~ 127 사용이 가능함 (작은 변수)
		
		int intData = byteData;
		//int 의 사용범위는 억단위 (byte 보다 큰 변수)
		// 더큰변수에 더작은변수를 담게 되면 자동으로 데이터타입이 바뀌게된다.
		//형변환 byte -> int 
		//▶묵시적 형변환 , UpCasting
		System.out.println(intData);
		
		//int형 데이터 타입을 가진 변수 intData2 o
		//double 데이터 타입을 가진 변수 doubleData 
		//에 담아서 UpCasting 시킨 후 콘솔에 출력
		int intData2 = 30;
		double doubleData = intData2;
		//int -> double UpCastring 
		System.out.println(doubleData);
		//======================자동형변환=======끝====
		//큰타입을 작은 타입으로 "강제로" 변환하며 명시적형변환(DownCasting)
		//Casting 일반적인 의미는 DownCasting
		int c ; //int형 변수 c를 선언 만 함.
		double d = 37.9 ; //double형 변수 d를 초기화(선언과 동시에 값을 할당)
		//int는 허용범위 중간 단계 , double은 제일 큰 단계
		//byte < short < int < long < float < double
		//DownCasting을 하는방법
		//일반적으로 할당하는 방법과 같으나 할당하는 부분 앞에 (데이터타입을명시)
		c = (int) d;//강제 형변환 
		System.out.println("변수 c의 값 : " + c);//c = d
		System.out.println("변수 d의 값 : " + d);//d = 37.9
		
		//int형 데이터타입을 가진 변수 x를 선언과 동시에 값을 할당 127;
		//byte형 데이터타입을 가진 변수 y를 만들고 y에 x값을 할당해서 DownCasting
		int x = 129;//변수 초기화 식
		byte y =(byte) x; // x = int 큰범위 , y = byte 작은 범위
		//-128 ~ 127 < 300
		//아빠옷 (큰 사람 ) , 아기옷 ( 작은 사람)
		System.out.println("변수 x의 값 : " + x);
		System.out.println("변수 y의 값 : " + y);
		
 	}
	
}
