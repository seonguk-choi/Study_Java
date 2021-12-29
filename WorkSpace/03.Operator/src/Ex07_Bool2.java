
public class Ex07_Bool2 {
	public static void main(String[] args) {
		//비교 ==, <, >
		// a == b ? 같다 true, 다르다 false
		int a = 10;
		String result = a == 10 ? "맞습니다." : "다릅니다.";
		System.out.println(result);
		//if 문이라는 제어문으로 대체 되지만 개념을 알자.
		// ? true 일때의 반환값 : false 일때의 반환값
		result = a != 10 ? "맞다" : "틀리다";
		System.out.println(result);
		
		boolean boolResult = a == 10; //== 비교를 사용하면 결과는 True, false
		System.out.println(boolResult);
	}
}
