package pack03_Char_String;

public class Ex01_Char {
	public static void main(String[] args) {
		//문자 데이터 타입 : char(2byte) 하나의 글자만 저장 : 유니코드
		//값을 할당할때는 문자 '' 싱글 코테이션 " 더블코테이션
		//작은따옴표를 사용
		char a = 'a';
		System.out.println(a);
		char b = '◆';
		System.out.println(b);
		char c = '가';
		System.out.println(c);
		char d = '김';
		System.out.println(d);
		//문자'열' 데이터를 저장할때는 String이라는 참조타입한다.(변수)
		//첫글자가 대문자이므로 유의 해야 한다.
		//문자열 데이터를 저장할때는 더블코테이션(쌍따옴표)사이에 값을
		//넣어서 할당한다(대입)
		String str = "지금은 자바 시간입니다.";
		System.out.println(str);
		String str2 = "지금은 4시가 넘어갑니다.";
		System.out.println(str2);
		str = "값을 재할당 합니다.";
		System.out.println(str);
	}
}
