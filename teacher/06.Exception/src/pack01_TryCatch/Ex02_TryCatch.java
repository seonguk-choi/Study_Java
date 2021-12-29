package pack01_TryCatch;

import java.util.Scanner;

public class Ex02_TryCatch {
	public static void main(String[] args) {
		//숫자를 입력하면 문자를 입력하세요. 라고 출력되는 프로그램을 만드세요.
		//Ex01<-숫자'만' 입력할수있는 프로그램 1,2~340
		//Ex02<-문자열'만' 입력할수있는프로그램. a,1a,b,1<입력하면안됨
		
		//1을 입력하면 문자를 입력하세요.(숫자입력시 사용자에게 문자를 입력하게 유도)
		//문자를 입력하면 잘입력되었습니다.(문자입력시 잘입력했다고 알려줌)
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				String inputData = sc.nextLine();
				int num = Integer.parseInt(inputData);
				System.out.println("잘못입력하셨습니다.");
				if(num == -1) {
					break;
				}
			} catch (Exception e) {
				System.out.println("잘입력하셨습니다.");
			}
		}
	}
}
