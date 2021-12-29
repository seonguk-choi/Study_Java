package pack03_for;

public class Ex03_for_for {
	public static void main(String[] args) {
		//문제1) 1부터 10까지 누적합(sum)을 구하시오.
		//sum <- 변수의 위치가 어디있어야하나
		//누적 : sum = sum + 어떤값 == sum +=어떤값;
		/*int sum = 0;
		int sum1 = 0;
		for(int i = 0 ; i <= 10 ; i++) {
			sum = sum + i;			
		}
		System.out.println(sum);
		for(int i = 0 ; i <= 10 ; i++) {
			sum1 +=i;
			System.out.println(i);
			System.out.println("sum : " + sum1);
		}*/
		
		//문제2)
		//★
		//★★
		//★★★
		//★★★★
		//★★★★★
		for(int i = 1 ; i <=5 ; i++) {
				for(int j = 1 ; j<=i ; j++) {
					System.out.print("★");
				}System.out.println();			
		}
		//문제3)
		//★
		//★★
		//★★★
		//★★
		//★
		
	}
}
