
public class Test2 {
	public static void main(String[] args) {
		//변수 == 데이터를 담기 위한 그릇.
		//변수에는 타입이라는게 존재한다.
		//int == 정수형을 담는 그릇 1~숫자
		//String == 문자열을 담는 그릇 ->" 문자열 "<-
		//double == 실수형 데이터를 담는 그릇 1.0~숫자
		//boolan == 부울형(논리형)데이터를 담는 그릇 true , false
		int a; // 변수의 선언
		//error>int a; // 이미 같은 지역에서 같은 이름의 주소를 사용하고 있기 때문.
		a = 10 ; //변수 a에 값을 할당한다.
		System.out.println(a+10);//<- 데이터 확인용 (콘솔에 출력만 하기위한 기능)
		
		//변수를 선언과 동시에 값을 할당 == 초기화
		int b = 20;
		System.out.println(b);
		//변수타입 (String) 변수명 ; 선언
		//변수명 = 쌍따옴표(더블 코테이션)->" 문자열 " ;
		String str ;
		str = "<- 이사이에 있는 값은 문자열 ->";
		
		//변수라는것을 사용하기위해서는 선언과 할당이 필요하다.
		//double d 소수점이 있는 데이터를 담기 위한 그릇;
		//String 문자열 데이터
		//double 실수형 데이터
		//int	 정수형 데이터
	}
}
