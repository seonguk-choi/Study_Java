package pack01_if;

public class Ex01_if {
	public static void main(String[] args) {
		//if = 만약에 (조건식) 
		//조건식 : 반드시 네, 아니오(참, 거짓)(true, false)
		//조건식이 될 수 없는 것 : 1+1, 이름이 뭐니?
		//조건식이 될 수 있는 것 : 1+1 = 2, 이름이 OOO 이니?
		int score = 71;
		//if(조건식) { 조건식이 참일때 실행할 코드 }
		if(score > 90) {
			//()가 참일때만 실행할 코드
			int score2 = 100;
			System.out.println("점수가 90보다 큽니다.");
		}
		 // {} 내부 변수는 내부메모리에만 존재한다. 블록이 끝나면 메모리도 끝난다.
		//score에 값은 그대로 둔 상태에서
		//if 문 하나를 더 선언하고 score 75값을 비교했을 때 참이 되는 조건식을
		//하나 넣고 콘솔창에 70보다 큽니다 라는 문자열 출력
		if(score > 70) { System.out.println("70보다 큽니다."); }
		if(score != 100) {System.out.println("최고~");}
		int a = 4;
		if(a != 10) { int b =10;
			System.out.println(a + b);}
	}
	
}
