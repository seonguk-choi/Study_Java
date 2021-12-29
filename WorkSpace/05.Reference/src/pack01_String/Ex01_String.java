package pack01_String;

import java.util.Scanner;

public class Ex01_String {
	public static void main(String[] args) {
		//ex) str1(choi) == str2(choi)
		Scanner sc = new Scanner(System.in);
		String str1 = "choi";
		String str2 = "choi";
		String str3 = sc.nextLine(); // <-"choi" 밖에서 들어오는 데이터 -> 데이터 공간을 따로 만들어 둠
		String str4 = new String("choi");// 밖에서 들어오는 데이터 ->데이터 공간을 따로 만들어 둠
		if(str1 == str2) { //String 변수 참조 주소가 같은지 물어보는거
			System.out.println("str1 , str2 참조가 같음");
		}
		if(str1 == str3) {
			System.out.println("str1 , str3 참조가 같음");
		}
		else {
			System.out.println("str1 , str3 참조가 다름");
		}
		if(str1 == str4) {
			System.out.println("str1 , str4 참조가 같음");
		}
		else {
			System.out.println("str1 , str4 참조가 다름");
		}
		String str5 = new String("choi");
		String str6 = new String("choi");
		//new 힙영역을 새로 준비해라.(새로운 메모리주소)
		if(str1.equals(str3)) {
			System.out.println("str1 , str3 값이 같음");
		}
		if(str1.equals(str5)) {
			System.out.println("str1 , str3 값이 같음");
		}
		if(str1.equals(str6)) {
			System.out.println("str1 , str3 값이 같음");
		}
		//String의 참조를 비교하는 경우는 거의 없다.
		//String의 실제 값(힙영역) 비교 할 때는 equals를 사용한다.
		//외부에서 들어오는 값(콘솔 Scanner, Html, DataBase)들은
		//전부 new라는 키워드가 붙어서 새로운 힙영역을 준비한다.
		
	}
}
