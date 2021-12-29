package pack06_Type;

public class Ex02_TestCasting {
	public static void main(String[] args) {
		//main메소드 { 우리가 작업할 공간 } 
		//1.번 문제
		int a;// 변수 a를 선언
		a = 0;// 변수 a에 값을 할당.
		System.out.println(a);
		
		//2번문제
		int b = 10; //변수의 초기화식 선언과 동시에 값을 할당(초기화)
		System.out.println(b);
		//3번문제
		byte c = 20 ; //변수의 초기화식 
		//4번 문제
		int d = c; //데이터 범위가 더큰 int에 더작은 byte를 담았기때문에 오류가x
				   //자동형변환 , UpCasting 
				    //아기가 아빠옷을 입는다 ( 문제 x)
		int e = 50 ;//초기화 
		byte f =(byte) e; //데이터 범위가 더큰 int가 더작은 byte에 담기기 위해서는
					//어떤 행위가 필요하다. 강제 형변환 , DownCasting
					//아빠가 아기옷을 입는다 (문제o 리폼,늘린다)
		System.out.println(e);
		System.out.println(f);
		
	}
}
