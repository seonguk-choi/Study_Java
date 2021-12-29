package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Ex02_DiceGame {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 //스캐너의 사용 준비
		 Random random = new Random();
		 //램덤 준비
		 while(true) {
			 System.out.println("게임시작 : 1, 게임종료 : -1 ▶입력(콘솔)");
			 //1.sc.nextLine() -> String 비교 equals
			 //2.sc.nextLIne() -> String -? int로비교
			 String userData = sc.nextLine();//sc.nextLine() enterkey 입력
			 if(!userData.equals("-1") && !userData.equals("1")) {//★ ! : 식을 반전 시킨다.
				 	System.out.println("잘못 입력하였습니다. !");
				 	 continue;
			}
			 if(userData.equals("-1")) {
				 System.out.println("게임을 종료합니다.");
				 break;
			 }
			//개발자가 실제 게임 소스파일 작성
			 System.out.println("주사위 게임을 시작합니다.");
			 System.out.println("사용자가 주사위를 굴립니다.");
			 System.out.println("Enter Key를 입력하세요.");
			 sc.nextLine(); // 사용자가 콘솔창에서 Enter key를 치기전까지 대기
			 int userNum = random.nextInt(6)+1;
			 //nextint(6) 0 ~ 5 + 1 = 1 ~ 6
			 System.out.println("사용자의 숫자 " + userNum);
			 System.out.println();
			 //컴퓨터가 주사위를 굴립니다.
			 //Enter key를 입력해주세요.
			 //int comNum = 
			 //누가 이겼는지 if문으로 출력
			 
			 System.out.println("컴퓨터가 주사위를 굴립니다.");
			 System.out.println("Enter Key를 입력하세요.");
			 sc.nextLine();
			 int comNum = random.nextInt(6)+1;
			 System.out.println("컴퓨터의 숫자 " + comNum);
			 System.out.println();
			 
			 if(userNum > comNum) {
				 System.out.println("사용자가 이겼습니다.");
				 System.out.println("축하합니다.");
				 System.out.println();
			 }else if(userNum == comNum) {
				 System.out.println("컴퓨터와  비겼습니다.");
				 System.out.println("게임을 다시 시작하세요.");
				 System.out.println();
			 } else {
				 System.out.println("컴퓨터가  이겼습니다.");
				 System.out.println("게임을 다시 시작하세요.");
				 System.out.println();
			 }
			 
			 
			 
			 /*if(userData.equals("-1")) {
				 System.out.println("게임이 종료되었습니다.");
				 break;
			 } else if(userData.equals("1")) {
				 //실제 게임이 시작되는 부분
			 } else {
				 System.out.println("잘 못 입력하였습니다.");
				// 반복문의 시작 블럭으로 이동
				 //1또는 -1이 아닌경우에는 잘못 입력하셨습니다.
				 // && and 논리곱 모든 조건이 만족
				 // 조건식1 && 조건식2
				 // true 1 * false 0  = 0
				 //|| or 논리합 하나의 조건이라도 만족하면 true
				 // false 0 + true 1 = 1
			 }*/
		 }
	}
}
