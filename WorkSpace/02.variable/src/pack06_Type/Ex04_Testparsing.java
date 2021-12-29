package pack06_Type;

import java.util.Scanner;

public class Ex04_Testparsing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //스캐너 사용을 위한 준비
		System.out.println("첫번째 숫자를 입력해주세요");
		String inputData1 = sc.nextLine();
		System.out.println("두번째 숫자를 입력해주세요");
		String inputData2 = sc.nextLine(); //sc.nextLine()을 이용해서 콘솔의 값을 받아옴
		System.out.println(inputData1 + inputData2);
		int num1 = Integer.parseInt(inputData1);
		int num2 = Integer.parseInt(inputData2);
		System.out.println("inputData1 과 inputData2의 합은 : " + (num1 + num2));
		System.out.println(num1 +"");
		//String데이터는 어떤 테이터에 더해도 결과가 String이 된다.
		// int형 데이터 num + String = 데이터타입 String
		// double형 데이터 d + String = 데이터타입 String
		// 단, 문자열은 더하면 하나의 문자열로 '연결'된다.
	}
}
