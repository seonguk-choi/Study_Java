import java.util.Scanner;

public class homework {
	
	
	static {
		System.out.println("학생 수를 입력하세요.");
		try {
			Scanner sc = new Scanner(System.in);
			int std_cnt = Integer.parseInt(sc.nextLine());
			if(std_cnt > 0) {
				System.out.println("학생수는 " + std_cnt + " 명입니다.");
			} else {
				System.out.println("양수로 입력하세요.");
			}
		} catch (Exception e) {
			System.out.println("숫자로 입력하주세요.");
		}
		
		
	}
}
