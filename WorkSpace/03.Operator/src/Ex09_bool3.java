
public class Ex09_bool3 {
	public static void main(String[] args) {
		//int형에 점수 입력, 변수 이름 score
		//점수에 따라 학점 부여 -> char 타입변수
		int score = 50; //점수를 담은 변수
		//다항연산자. 
		char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : (score > 70) ? 'C' : (score > 60) ? 'D' 
			       : (score > 50) ? 'E' : 'F';			
				System.out.println("점수 : " + score + "학점 : " + grade);
		//60점 보다 크면 D
		//50점 보다	크면 E
		//그외 F학점이 된다.
	}
}
