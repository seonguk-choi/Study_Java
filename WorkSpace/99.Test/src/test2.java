import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		//int형에 점수 입력, 변수 이름 score
				//점수에 따라 학점 부여 -> char 타입변수
		int score = 40;
		char grade = (score > 90) ? 'A' : (score >80) ? 'B' : (score > 70) ? 'C' : (score > 60) ? 'D' :
					 (score > 50) ? 'E' : 'F';
		System.out.println(grade);
		
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		int a = Integer.parseInt(inputData);
		String b = (a > 90) ? "잘햇어요." : (a > 80) ? "응 좋아요" : (a > 70) ? "좋아요" : (a > 60) ? "하호하호" : "굿좝";
		System.out.println(b);
 	}
}
