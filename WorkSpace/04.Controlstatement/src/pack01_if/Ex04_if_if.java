package pack01_if;

public class Ex04_if_if {
	public static void main(String[] args) {
		//class 지역 외에 (main method, if, else 지역)
		//어디든 if문 사용 가능 (제어문 사용가능)
		int score = 100;
		if( score > 90) {
			int a = 0;
			System.out.println("90점 보다 큽니다.");
			if(score == 100) {//지역은 계속 나눌 수 있다.
				System.out.println("만접입니다.");
			}
			
		}//----------------------------------------if문 중첩 if문
		
		if(score < 90) {
			System.out.println("점구가 90보다 작습니다.");
		} else {
			if(score == 100) {
				System.out.println("만점입니다.");
			}
			System.out.println("점수가 90보다 큽니다.");
		}
	}
}
