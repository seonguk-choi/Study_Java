package pack02_switch;

public class Ex02_SwitchNobreak {
	public static void main(String[] args) {
		
		int time = 8;
		switch(time) {
			case 8:
				System.out.println("출근을 합니다.");
				break;
			case 9:
				System.out.println("아침 회의를 합니다.");
			case 10:
				System.out.println("커피를 마십니다.");
			default:
				System.out.println("일을 합니다.");
		}
	}
}
