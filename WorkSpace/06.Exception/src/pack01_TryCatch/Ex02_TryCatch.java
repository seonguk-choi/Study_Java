package pack01_TryCatch;

import java.util.Scanner;

public class Ex02_TryCatch {
	public static void main(String[] args) {
		//숫자를 입력하면 문자를 입력하세요 출력
		//Ex01 <- 숫자만 입력
		//Ex02 <- 문자만 입력
		//1 입력하면 문자를 입력하세요.
		//문자를 입력하면 잘 입력하였습니다.
		Scanner sc = new Scanner(System.in);
		
		/*while(true) {
			try {
				String str = sc.nextLine();
				str.equals("1");
				System.out.println("문자를 입력하세요");
				String str2 = sc.nextLine();
				System.out.println("잘 입력하였습니다.");
				
			}catch (Exception e){
				System.out.println("문자를 입력하세요.");
			}
			
		}*/
		while(true) {
			try {
				int number = Integer.parseInt(sc.nextLine());
				if(number == 1){
					System.out.println("문자를 입력하세요.");
				}
			}catch (Exception e) {
				System.out.println("잘 입력하였습니다.");
			}
		}
		
	
	}
}
