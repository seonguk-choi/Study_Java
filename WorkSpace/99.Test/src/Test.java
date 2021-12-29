import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());		
	 //1.구구단 옆으로 출력
	//1*1 = 1..........1*9 = 9	
		for(int i = 1 ; i<=n ; i++) {
			for(int k = 1 ; k <= 9 ; k++ ) {
				System.out.print(i + " x " + k + " = " + (i*k) +" ");	
			}System.out.println();
		}
		
		System.out.println("===============================");
		
	//2.구구단 세로로 출력
	//1*1 = 1, 2*1 = 2......9*1 = 9
	//입력 한 숫자만큼 구구단이 나올 수 있는 처리	
		for(int i = 1 ; i<=n ; i++) {
			for(int k = 1 ; k <= 9 ; k++ ) {
				System.out.print(k + " x " + i + " = " + (k*i) +" ");	
			}System.out.println();
		}
	}
}
