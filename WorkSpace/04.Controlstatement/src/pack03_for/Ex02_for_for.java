package pack03_for;

public class Ex02_for_for {
	public static void main(String[] args) {
		//for 1개 1차원, for문이 들어날수록 차원이 증가
		//ex)for1)excel columns 또는 rows 접근 둘 중 하나는 접근(행 또는 열)
		//ex)for2)excel columns 과 rows 두개다 접근함(행열구조) 2차원
		//ex)for3)excel columns 과 rows + sheet의 개념 3차원
		//프로그램을 짜는데 for문이 3개 이상이면 로직 검토가 필요
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
			for(int j = 0 ; j < 10 ; j++) {
				System.out.println(j);
			}
		}//for1
		System.out.println("================");
		//구구단을 출력하시오.
		for(int i = 2 ; i < 10 ; i++) {
			System.out.println("구구단 " + i + " 단");
			for(int j = 1 ; j < 10 ; j++) {
				System.out.println(i + " * " + j  + " = " + (i * j));
			}
		}
	}
}
