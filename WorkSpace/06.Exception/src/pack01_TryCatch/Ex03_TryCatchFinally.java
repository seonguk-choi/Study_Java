package pack01_TryCatch;

public class Ex03_TryCatchFinally {
	public static void main(String[] args) {
		//try { 오류가 날 수 도 있는 코드를 넣고 실행 }
		//catch{ 오류가 실제 발생했을 때 실행 }
		//finally{ 오류가 나던 안나던 '무조건' 실행해야 한다. }
		//1. 가스불 켠다 -> 2. 요리시작 -> 3.요리끝 -> 4.가스불 끈다 -> 5.요리종료
		//close 데이터베이스에 
		try {
			System.out.println("가스불 켠다");
			System.out.println("요리를 시작힙니다.");
			int a = 10/0;
			System.out.println("요리 끝");
			//System.out.println("가스불 끈다.");
			//System.out.println("요리를 종료합니다.");
		} catch (Exception e) {
			System.out.println("예외가 발생함(가스불, 여러이유)");
			//System.out.println("가스불을 끈다.");
			//System.out.println("요리를 종료합니다.");
		} finally {//무조건 실행되하는 코드
			System.out.println("가스불을 끈다.");
			System.out.println("요리를 종료합니다.");
		}
	}
}
