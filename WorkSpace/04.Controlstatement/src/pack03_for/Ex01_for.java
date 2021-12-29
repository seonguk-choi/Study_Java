package pack03_for;

public class Ex01_for {
	public static void main(String[] args) {
		//매우 중요함
		//for(1.초기값;)(2.조건식; 3.증감식){
		// 4.실행부
		//}
		//1.초기값: 조건문의 기분(조건문을 시작할 때의 수) 0~
		//2.조건식: 조건식이 true일 동안 계속 반복
		//3.증감식: 조건식에 증감식이 빠지거나 잘 못들어가면 무한루프한다(error)
		//4.실행부: 조건식이 True일때 실행하는 부분
		for(int i = 0 ; i <= 10 ; ++i) {
			System.out.println(i);
		}
		System.out.println("=====");
		//0에서 9까지 정수 중에서 짝수만 출력
		//2, 4, 6, 8 ( +2)
		for(int i = 0 ; i < 10 ; i+=2) {
			System.out.println(i);
		}
		System.out.println("=====");
		for(int i = 0 ; i < 10; i++) {
			if(i % 2 == 0) {
				System.out.println("짝수 : " + i);
			} else {
				System.out.println("홀수 : " + i);
			}
		}
		System.out.println("=====");
		//1부터 100까지 정수 중 홀수만 출력
		for (int i = 0 ; i <= 100 ; i++) {
			 if(i % 2 != 0) {
				 System.out.println("홀수 : " + i);
			 }
		}
		
		
		
	}
}
