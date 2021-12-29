package pack04_while;

public class Ex02_while {
	public static void main(String[] args) {
		//매우 중요함
		//1.초기값(조건식의 기준이 되는 값)
		//2.조건식
		//3.증감식
		//1~100 까지의 수중 (정수, 숫자형) int
		//홀수만 출력
		//1.while 문 내부에 if문 사용
		//2.while문의 증감식이 조금 변경
		int i = 1;
		/*while(i <100) {
			i++;
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}*/
		while(i < 99) {
			i += 2;
			System.out.println(i);
		}
	}
}
