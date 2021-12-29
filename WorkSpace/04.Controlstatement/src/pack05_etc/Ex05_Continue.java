package pack05_etc;

public class Ex05_Continue {
	public static void main(String[] args) {
		//break;	반복문 중단
		//continue; 반복문 계속 진행.
		//홀수의 누적합(1~10)
		int oddSum = 0;
		for(int i = 1 ; i <=10 ; i++) {
			if(i % 2 == 0) {
				continue;
			}
			oddSum += i;
		}System.out.println(oddSum);
		
	}
}
