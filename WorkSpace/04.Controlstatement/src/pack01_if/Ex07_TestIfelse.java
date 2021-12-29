package pack01_if;

public class Ex07_TestIfelse {
	public static void main(String[] args) {
		//int형 데이터 변수 code 변수 선언
		//값을 할당하면서 테스트
		//if문사요 값이 1이면 콘솔창에 남자 출력
		//값이 2이면 여자, 3이면 남자, 4이면 여자
		//그외 값 주민등록번호 오류.
		int code;
		code = 6;
		if(code == 1) {
			System.out.println("남자");
		}else if(code == 2) {
			System.out.println("여자");
		}else if(code == 3) {
			System.out.println("남자");
		}else if(code == 4) {
			System.out.println("여자");
		}else {
			System.out.println("주민등록번호 오류");
		}
		//논리연산자 && and 논리곱(모든 조건 만족시 True) 1 * 0 = 0
		//논리연산자 || or 논리합(하나의 조건만 만족해도 true) 1+ 0 = 1
		//논리연산자 5번 남자, 6번 여자
		if(code == 1 || code == 3 || code == 5) {
			System.out.println("남자");
		}else if(code == 2 || code == 4 || code ==6) {
			System.out.println("여자");
		}else {
			System.out.println("주민등록번호 오류");
		}	
	}
}
