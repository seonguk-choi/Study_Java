
public class Ex09_Bool3 {
	public static void main(String[] args) {
		//int형에 점수를 입력한다. 변수의 이름은 score
		//점수에 따라서 학점을 부여한다 . => char 타입의 변수
		int score = 95; //점수를 담고있는 변수
		//다항연산자. 
		char grade = (score > 90) ? 'A' : (score > 80) ? 'B' 
					: (score > 70 ) ? 'C' : (score > 60 ) ? 'D' 
							: (score > 50 ) ? 'E' : 'F'  		;
		System.out.println("점수 : " + score + " 학점 : " + grade);
		//60점보다 크면 D
		//50점보다 크면 E
		//그외에는 F학점이 될수있게 다항연산자를 수정하시오.
	}
}
