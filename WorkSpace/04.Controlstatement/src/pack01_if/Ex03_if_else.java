package pack01_if;

import java.util.Scanner;

public class Ex03_if_else {

	public static void main(String[] args) {
		//일반적으로 방금까지 사용한 단수 if문 뒤에 else라는 키워드를 통해
		//if(조건식) 부분이 참이 아닐때 실행하는 블럭을 만든다.
		//if(조건식){  참일 때 실행  } else {  거짓일 때 실행  }
		int score = 75;
		if(score > 90) { 
			//참일때의 실행부
			System.out.println("점수가 90점 보다 큽니다.");
		} else {
	
			//거짓일때의 실행부
			System.out.println("점수가 90점 보다 작습니다.");
		}//else
		//if(){}else{} 문을 이용하여
		//숫자를 입력받아 그 숫자가 짝수, 홀수인지 출력
		//if(짝수 또는 홀수 분별 식) {  맞으면 출력  } else {  아니면 출력  }
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		int num1 = Integer.parseInt(inputData);
		if(num1 % 2 > 0 ) {
			System.out.println("입력하신 숫자는 홀수입니다.");
		} else {
			System.out.println("입력하신 숫자는 짝수입니다.");	
		}
		
	}

}
