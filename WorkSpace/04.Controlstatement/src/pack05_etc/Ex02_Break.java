package pack05_etc;

import java.util.Scanner;

public class Ex02_Break {
	public static void main(String[] args) {
		//스캐너 콘솔창의 입력된 값을 가져와 사용.
		Scanner sc = new Scanner(System.in);
		/*while(true) {
			String inputData = sc.nextLine();
			if(inputData.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} 
				
				//문자열은 메모리에 저장되는 방식이 일반 변수와 다르다(class)
				//따라서 문자열을 비교하기 위해 equals 함수 사용
		}*/
		//===========================================================================
		
		//1.Scanner를 사용하여 콘솔에 입력된 값을 계속 가져온다.
		//2.단 입력은 테스트 시 숫자만 입력
		//3.String -> int로 바꿔서 사용자가 입력한 값을 계속 누적해서 더한다.
		//4.단, 사용자가 -1 을 입력시 "프로그램이 종료됩니다." "사용자가 누적한 값은 sum 입니다
		//===========================================================================
		/*int sum = 0;
		while(true) {
			String inputData = sc.nextLine();
				if(inputData.equals("-1")) {
					System.out.println("프로그램이 종료됩니다.");				
					break;
				}
			sum = sum + Integer.parseInt(inputData);
		}System.out.println("사용자가 누적한 값은 " + sum + " 입니다.");*/
		//===========================================================================
		int sum = 0;
		while(true) {
			String inputData = sc.nextLine();
			if(inputData.equals("-1")) {
				System.out.println("프로그램이 종료됩니다.");
				break;//<-포인트 핵심!
			}
			sum += Integer.parseInt(inputData);
			/*int temp = Integer.parseInt(inputData);*/
		} System.out.println(sum);
	}
}
