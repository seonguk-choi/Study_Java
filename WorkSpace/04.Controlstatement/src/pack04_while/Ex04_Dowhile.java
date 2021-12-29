package pack04_while;

public class Ex04_Dowhile {
	public static void main(String[] args) {
		//별로 안중요함 사용빈도 극히 낮음.(float, long 같은거)
		/*do {
			실행부 - 무조건 한번 실행
		}while(조건식); 실행부를 반드시 한 번 실행 후 조건식을 봄*/
		do {
			System.out.println("do가 실행이 되었습니까?");
		}while(false);
		
		//1~10 합계
		int i = 1;
		int sum = 0;
		do {
			sum +=i;
			i++;
		} while( i<=0);
		System.out.println(sum);
	}
}
