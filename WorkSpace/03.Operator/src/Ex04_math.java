
public class Ex04_math {
	public static void main(String[] args) {
		//사칙연산 + - * / %(나머지 값)
		//나머지가 중요한 이유 : 홀, 짝을 구분한다.
		//어떤 값을 2고 나누고 나머지 1 :홀수 , 나머지 0 : 짝수
		int v1 = 5;
		int v2 = 2;
		int result; // 선언만 result(아직 값이 엄다.)
		result = v1 + v2;
		System.out.println("v1 + v2 = " + result);
		result = v1 - v2;
		System.out.println("v1 - v2 = " + result);
		result = v1 * v2;
		System.out.println("v1 * v2 = " + result);
		result = v1 / v2;
		System.out.println("v1 / v2 = " + result);
		result = v1 % v2; // 나머지 구하는 연산자
		System.out.println("v1 % v2 = " + result);		
	}
}
