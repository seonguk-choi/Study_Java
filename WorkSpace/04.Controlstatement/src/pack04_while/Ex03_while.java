package pack04_while;

public class Ex03_while {
	public static void main(String[] args) {
		//while 문만사용
		//1. 1~10 누적합.
		/*int i = 0;
		int sum = 0;
		while(i < 10) {
			i++;
			sum +=i;
		}System.out.println(sum);*/
		int i = 1;
		int sum = 0;
		while(i<=10) {
			sum +=i;
			i++;
		}
		System.out.println(sum);
			
		//2.별만들기
		/*while(i <=5) {
			i++;
			int j = 1;
			while(j<=i) {
				j++;
				System.out.print("★");
			}
			System.out.println();
		}*/
		int k = 1;
		while(k <=5) //for(int k = 1 ; k <=5 ; k++) 
		{ int j = 1;
			while(j<=k) {
				System.out.print("★");
				j++;
			}
			System.out.println();
			k++;
		}
	}
}
