package pack04_while;

public class Ex01_while {
	public static void main(String[] args) {
		//for문은 사용하는 용도의 반복횟수가 정해져 있는 경우에 많이 사용
		//while문은 사용하는 용도가 반복횟수가 정확히 정해져있지 않은 경우
		//while(1.조건식) {
			// 2. 실행부
		//}
		int i = 0;
		while(i < 10) {
			//true가 되면 실행되는 부분
			System.out.println(i);
			i++;
		}
		//for(int i = 0 ; i <10 ; i++)
		//반복문에서 중요한 요소
		//1.초기값(조건식의 기준이 되는 값)
		//2.조건식
		//3.증감식
	}
}
