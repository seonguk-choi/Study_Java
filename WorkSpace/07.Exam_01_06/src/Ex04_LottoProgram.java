import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex04_LottoProgram {
	public static void main(String[] args) {
		//1. 자동구입(5000원)
		//몇개 살껀지 갯수 * 1000원
		//2.수동 구입(몇 개 살건지 갯수 * 1000원)
		
		//Random r = new Random();
		//r.nextint(45)+1;
		//1~45까지의 수를 랜덤으로 return받는다(반환 받음)
		//똑같은 번호 뽑을 수 없다.
		//배열이용해 처리
		Scanner sc = new Scanner(System.in);
		Random r = new Random(); 
		System.out.println("1.자동구입 2.수동구입 3.종료");
		int user = Integer.parseInt(sc.nextLine());
		int k = 0;
		int[][] userlotto = null;
		while(true) {
			try	{
				if(user == 1) {
					System.out.println("몇 장 구매하시겠습니까?");
					int userNum = Integer.parseInt(sc.nextLine());
					userlotto = new int[userNum][6];
					while(userNum > k) {
						for(int i = 0 ; i < userlotto[k].length ; i++) {
							userlotto[k][i] = r.nextInt(45)+1;
							for(int j = 0 ; j< i ; j++) {
								if(userlotto[k][i] == userlotto[k][j]) {
									i= i-1;
								}
							}		
						}
						System.out.println(Arrays.toString(userlotto[k]));
						k++;
					}break;
				} else if(user == 2) {
					System.out.println("몇 장 구매하시겠습니까?");
					int userNum = Integer.parseInt(sc.nextLine());
					userlotto = new int[userNum][6];
					while(userNum > k) {
						for(int i = 0 ; i < userlotto[k].length ; i++) {
							System.out.println((i+1) + " 번째 장을 입력하세요.");
							userlotto[k][i] = Integer.parseInt(sc.nextLine());
							if( userlotto[k][i]>0 && userlotto[k][i] < 46) {
								for(int j = 0 ; j< i ; j++) {
									if(userlotto[k][i] == userlotto[k][j]) {
										System.out.println("중복됩니다.");
										i= i-1;
									}
								}		
							}
							else {
								System.out.println("숫자를 다시 입력하세요.");
								i= i-1;
								continue;
							}
						} 
						System.out.println(Arrays.toString(userlotto[k]));
						k++;
					}break;
				} else if(user == 3) {
					System.out.println("종료합니다.");
					break;
				}
			}catch (Exception e) {
				System.out.println("다시 입력하세요.");
			}
		}
	}
}
