package pack02_switch;

public class Ex01_Switch_Case {
	public static void main(String[] args) {
		//switch 선택문 : 다중 if문을 조금 간략하게 표현
		//switch(기준값) {
			//case 값:
				//case 값을 만족할 때 실행되는 실행부
			//break; -> 실행문 뒤에는 반드시 break로 끊어준다.
		//}
		//기준값을 넣는 조건이 까다롭다.(조건식을 사용 못한다)
		int score = 90;
		switch(score / 10) {	// score / 10 = 7
			case 7:
				System.out.println("점수가 78");
				break;
			case 8:
				System.out.println("점수가 80");
				break;
			default:
				System.out.println("점수의 case가 없음.");
				break;
		}//switch
		
	}
}
