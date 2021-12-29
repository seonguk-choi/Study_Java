package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Ex01_HighLowGame {
	public static void main(String[] args) {
		Random random = new Random();
		int comNumber = random.nextInt(100)+1; //(값) 그값까지만 랜덤 한 수를 뽑음
		int userNumber = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		//1.comNumber 라는 변수에는 1~100까지 램던한 수가 저장
		//2.HighLow 게임구현
		//무한 반복. 사용자 입력한 수가 comNumber 같을때까지
		//사용가자 입력한 수가 컴퓨터 랜덤숫자보다 큰지 작은지 출력
		//3.count라는 변수는 사용자가 답을 몇 번 입력했는지 체크
		//4.comNumber == userNumber가 같으면 게임 종료
		//5.count 몇인지 출력
		/*while(true) {
			userNumber = sc.nextInt();
			if (userNumber > comNumber) {
				System.out.println("userNumber 가" + (userNumber - comNumber) + "만큼 큽니다.");
				count++;
			}
			if (userNumber < comNumber) {
				System.out.println("userNumber 가" + (comNumber - userNumber) + "만큼 작습니다.");
				count++;
			}
			if(userNumber == comNumber) {
				System.out.println("숫자가 같습니다.");
				count++;
				break;
			}
		}System.out.println("총 " + count + "회 도전하였습니다.");*/
		while(true) {
			count++;
			userNumber = sc.nextInt();
			if (userNumber > comNumber) {
				System.out.println("userNumber 가" + (userNumber - comNumber) + "만큼 큽니다.");
				continue;
			}
			if (userNumber < comNumber) {
				System.out.println("userNumber 가" + (comNumber - userNumber) + "만큼 작습니다.");
				continue;
			}
			if(userNumber == comNumber) {
				System.out.println("숫자가 같습니다.");
			}break;
		}System.out.println("총 " + count + "회 도전하였습니다.");
		
		
	}
}
