package pack05_etc;

public class Ex01_Break {
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("계속출력");
			break;
		}
		
		int i = 1;
		while(true) {
			if( i == 10) {
				break;
			}
			System.out.println(i);
			i++;
		}
		
		if(i == 10) {
			while(true) {
			}
		}
		
		for(int j = 1 ; j<=i ; j++) {
			if(j == 1) {
				
			}
		}
		//제어문은 제어문 내부에서 중첩 계속 가능하다.
		//if(조건식){
		//	변수선언 k;
		//	while(조건식) {
		//		for(초기값 ; 조건식 ; 증감식) {
		//			if(조건식){
		//				....계속해서 중첩가능(제어문)
		//			}
		//		}
		//	}
		//}//변수 k의 사용 범위
	}	
}
