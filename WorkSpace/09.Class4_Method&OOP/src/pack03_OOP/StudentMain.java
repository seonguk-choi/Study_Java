package pack03_OOP;

import java.util.Random;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.아무 숫자나 물러주세요. 2. -1 은 종료입니다.");
			int user = Integer.parseInt(sc.nextLine());
			try {
				if(user == -1) {
					System.out.println("종료");
					break;
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("시작");
				Random r = new Random();
				String[] subject = {"Java", "CSS", "javaScript"};
				int[]score = new int[subject.length];
				StudentDTO[] dtos = new StudentDTO[3];
				for (int i = 0; i < subject.length; i++) {
					score[i] = r.nextInt(100)+1;
				}
				dtos[0] = new StudentDTO("최", subject, score, 1);
				dtos[1] = new StudentDTO("성", subject, score, 2);
				dtos[2] = new StudentDTO("욱", subject, score, 3);
				
				/*String[] subject = {"Java", "CSS", "javaScript"};
		StudentDTO dto = new StudentDTO("최", subject);
		System.out.println(Arrays.toString(dto.subject));
		System.out.println(Arrays.toString(dto.scores));
				 */
				StudentDAO dao = new StudentDAO();
				dao.display(dtos);
				dao.displaySum(dtos);
				dao.displayAvg(dtos);
				dao.displayGrade(dtos);
				System.out.println("학생추가");
				dao.displayNewstd(dtos);
			}
		}
	}
}
