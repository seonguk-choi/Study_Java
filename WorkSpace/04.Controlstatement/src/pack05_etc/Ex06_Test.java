package pack05_etc;

import java.util.Scanner;

public class Ex06_Test {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in); 사용
		// 국어(kor), 영어(eng), 수학(math) 점수를 입력받는다.
		// 각 과목의 점수는 0 ~ 100
		// 그외에 점수가 입력되면 다시 입력하라는 메시지가 나오고 계속 입력 받는다.
		// 단, 입력은 숫자만
		// kor, eng, math 세개의 int 형 변수에 값이 모두 입력되면
		// 과목의 평균점수와 합계 점수 출력

		// 합계 점수 = (kor + eng + math);
		// 평균 점수 = (kor + eng + math)/3;
		// 평균 점수 = 합계점수 / 3;
		// int kor = 0;
		// int eng = 0;
		// int math = 0;
		// while(ture){
		// if(조건식){
		// kor = 사용자가 입력한 값;
		// break
		// }
		// }

		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		while (true) {
			if (kor == 0) {
				while (true) {
					String inputData = sc.nextLine();
					kor = Integer.parseInt(inputData);
					if (0 > kor || kor > 100) {
						System.out.println("다시 입력하세요.");
						continue;
					}break;
				}
			}
			if (eng == 0) {
				while (true) {
					String inputData = sc.nextLine();
					eng = Integer.parseInt(inputData);
					if (0 > eng || eng > 100) {
						System.out.println("다시 입력하세요.");
						continue;
					}break;
				}
			}
			if (math == 0) {
				while (true) {
					String inputData = sc.nextLine();
					math = Integer.parseInt(inputData);
					if (0 > math || math > 100) {
						System.out.println("다시 입력하세요.");
						continue;
					}break;
				}
			}
			
			if(kor != 0 && eng != 0 && math != 0) {
				break;
			}
		} System.out.println("합계 점수 : " + (kor + eng + math));
		  System.out.println("평균 점수 : " + (kor + eng + math)/3);
		/*while(true) {
			String inputData = sc.nextLine();
			System.out.println(inputData);
			int num = Integer.parseInt(inputData);
			//&& and 연산자
			// || or 연산자
			if(num >0 ) {
				System.out.println("0보다 큼");
				kor = Integer.parseInt(inputData);
				if(num >= 0 && num <= 100) {
					System.out.println("0이상 100이하");
					System.out.println(kor);
					break;
				}
			}
		}*/
	}
}
