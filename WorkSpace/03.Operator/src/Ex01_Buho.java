
public class Ex01_Buho {
	public static void main(String[] args) {
		//부호라는 것은 정수나 숫자형 데이터 앞에 +, - 붙여
		//해당 숫자의 음, 양을 나타낸다. 양수는 + 생략(관례
		int x = -100;
		System.out.println("원본 데이터 x의 값 : " + x);
		int result1 = +x;// -100
		int result2 = -x;// 100
		System.out.println("result1 의 값 : " + result1);
		System.out.println("result2 의 값 : " + result2);
		int result3 = x * 1; // +x
		int result4 = x * -1;// -x
		System.out.println("result3 의 값 : " + result3);
		System.out.println("result4 의 값 : " + result4);
		
	}
}
