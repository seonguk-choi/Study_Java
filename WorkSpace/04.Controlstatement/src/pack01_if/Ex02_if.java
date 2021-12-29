package pack01_if;

import java.util.Scanner;

public class Ex02_if {
	public static void main(String[] args) {
		//흐름을 제어하는 제어문 중에는 크게 조건문, 반목문
		//조건문 if
		//단순 if문 : 조건을 판단하여 참일 경우에만 실행
		//if(조건식) {
		//  if문의 구역, if문의 body 조건식이 참일 때 실행되는 부분
		//}
		Scanner sc = new Scanner(System.in); //스캐너의 사용을 준비함(스캐너 초기화식)
		String inputData = sc.nextLine();
		//문제 intputData에는 sc. nextline() 통해서 String 숫자데이터가 들어있다.
		//해당하면 숫자가 홀수, 짝수인지 if문으로 판단하여 출력
		//나머지를 구하는 방법 % 2 == 1 인지 % 2 == 0
		int num1 = Integer.parseInt(inputData);
		if(num1 % 2 < 1) {System.out.println("입력하신 숫자는 짝수입니다.");}
		if(num1 % 2 > 0) {System.out.println("입력하신 숫자는 홀수입니다.");}
	}
}
