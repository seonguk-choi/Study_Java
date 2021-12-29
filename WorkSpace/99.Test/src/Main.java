import java.util.Random;
import java.util.Scanner;

public class Main {
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
		System.out.println("난이도를 입력해주세요.");
		while(true) {
			try {
				int userNum = Integer.parseInt(sc.nextLine());
				if(userNum < 0){
					System.out.println("다시 입력하세요.");
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("게임을 시작합니다.");
				break;
			}
		}
		System.out.println("배열의크기를 입력하세요.");
		int userNum = Integer.parseInt(sc.nextLine());
		int[] arr = new int[userNum];
		System.out.println();
		Random r = new Random();
		System.out.println("컴퓨터가 선택하였습니다.");
		int comNum = r.nextInt();
		arr[comNum-1] = 1;
		System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.println("숫자를 선택하세요.");
		while(true) {
			try {
					int userInt = Integer.parseInt(sc.nextLine());
					if(arr[userInt-1] = 1) {
				
					System.out.println("정답입니다.");
				}else {
					System.out.println("아깝네요. 다시 입력해주세요.");
				}
			} catch (Exception e){
				System.out.println("입력이 잘 못 되었습니다.");
			}
		}
		
		
	}
}
	 
		
	
