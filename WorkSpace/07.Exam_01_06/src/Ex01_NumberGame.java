import java.util.Random;
import java.util.Scanner;

public class Ex01_NumberGame {
	public static void main(String[] args) {
		//배열, 반복문, 조건문, Random, Scanner
		//스캐너를 통해 입력받는다.
		//1.난이도를 입력하세요. 1~ 아무숫자나 가능
		//숫자 이외에 값이 들어오면은 사용자에게 다시 입력받는다.
		//2.배열을 만든다.(배열의 크기는 사용자가 입력한 만큼의 크기를 가진다.)
		//3.random.nextint에 숫자 숨긴다.
		//4.게임을 시간한다.
		//사용자가 숫자를 입력해서 랜덤하게 숨겨놓은 index의 주소를 맞춤
		//사용자가 index의 주소를 맞추지 못하면 다시 입력.
		Scanner sc  = new Scanner(System.in);
		Random random = new Random();
		System.out.println("난이도를 입력하세요.");
		while(true) {
			try {
				int a = Integer.parseInt(sc.nextLine());
				if(0>a) {
				System.out.println("다시입력하세요.");
				}else {
					throw new Exception();
				}
			}catch (Exception e) {
				System.out.println("배열의 크기를 정해하세요.");
				int[] arr = new int[Integer.parseInt(sc.nextLine())];
				arr[random.nextInt(arr.length)+1] = 1;
				/*int comNum = random.nextInt(arr.length);*/
				System.out.println("컴퓨터가 숫자를 골랐습니다. 게임을 시작합니다.");
				while(true) {
					try {
						int userNum = Integer.parseInt(sc.nextLine());
							if(arr[userNum] != 0) {
								System.out.println("맞았습니다."); 
								break;
							}else {
								System.out.println("아깝네요. 다시입력해주세요.");
							}
					} catch (Exception h) {
						System.out.println("양수로 입력해주세요.");
					}
				}
			}
	
		}
	}
}
