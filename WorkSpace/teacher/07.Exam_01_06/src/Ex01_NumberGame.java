import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01_NumberGame {
	public static void main(String[] args) {
		// 배열 , 반복문 , 조건문 , Random , Scanner
		// 스캐너를 통해서 콘솔창에 입력을 받는 프로그램이다.
		// 1.난이도를 입력해주세요 1~ 아무'숫자'나 가능)
		// 숫자 이외에 값이 들어오면 사용자에게 값을 다시 입력받는다. while(true)
		// 2.배열을 만든다 (배열의 크기는 사용자가 입력한 만큼의 크기를 가진다.)
		// 3.random.nextint(사용자가 입력한만큼의 범위) +1
		// 배열에 랜덤한 index에 숫자를 숨긴다.
		// 4.게임을 시작한다.
		// 사용자는 숫자를 입력해서 랜덤하게 숨겨놓은 index의 주소를 맞추는 게임.
		// 사용자가 index의 주소를 맞추지 못한경우에는 다시 입력을 받음.
		// [0][0][0][0][0][1][0][0][0][0]
		// 1 2 3 6
		// x x x O
		Scanner sc = new Scanner(System.in);
		int userNum = 0;
		System.out.println("난이도를 입력하세요.1~아무숫자");
		userNum = Integer.parseInt(sc.nextLine( ));
		
		System.out.println(userNum);// 사용자가 숫자 입력을 완료함(난이도)
		int[] arr = new int[userNum];// 사용자가 입력한 값을이용해서 배열을만듬.
		Random r = new Random();
		int ranInt = r.nextInt(userNum) + 1;// 1~10
		arr[ranInt - 1] = 1; // 10-1 0~9
		System.out.println(Arrays.toString(arr));
		while (true) {// 사용자가 답을 맞출때까지 반복하는 (횟수에 정함이 없음)
			System.out.println("게임이 시작됩니다. 1~" + userNum + "사이에 값을 입력하세요.");
			String inputData = sc.nextLine();
			try {

				int userInt = Integer.parseInt(inputData);
				if(arr[userInt-1] == 1) {
					System.out.println("축하드립니다. 정답입니다.");
					break;
				}else {
					System.out.println("오답입니다.");
				}
			} catch (Exception e) {

				System.out.println("숫자만입력하세요. 입력한값:" + inputData);
			}

		}
	}
}
