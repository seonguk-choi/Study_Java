package pack01_if;

import java.util.Scanner;

public class Ex05_if_if {
	public static void main(String[] args) {
		//중첩 if문 class를 제외한 어느 지역이든 제어문 사용 가능
		//지역 == { } 블럭킹을 가지고 있느냐. == true 지역이 있다.
		//if문이 3개 이상 이면 내 코딩을 의심할 필요가 있다.
		if(10 == 10) {
			if(9 == 9) {
				if(8 == 8) {
					
				}//if문 8 == 8 지역 
			}//if문 9 == 9 지역
		}//if문 10 == 10 지역
		//scanner를 통해 값 입력
		//if문 0보다 크면 if문 내부로 이동.
		//10보다 큰지 비교 10보다 크면
		//if 내부로 이동 20보다 크면 20보다 큽니다. 출력
		//if (비교1) {
			//if(비교2){
				//if(비교3){
				//}
			//}
		//}
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		int num1 = Integer.parseInt(inputData);
		if(num1 > 0) {
			if(num1 > 10) {
				if( num1 > 20) {
					System.out.println("20보다 큽니다.");
				}
			}
		}
		int num2 = Integer.parseInt(sc.nextLine());//바로 바꿔주세요
		if(num2 > 0) { //0보다 크면 실행되는 영역
			if(num2 > 10) { //10보다 크면 실행되는 영역
				if( num2 > 20) { //20보다 크면 실행되는 영역
					System.out.println("20보다 큽니다.");
				}
			}
		}
	}
}
