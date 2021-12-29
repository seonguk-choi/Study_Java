package pack04_Method;

public class Ex03_Calculator {
	//숫자 두개를 가지고 있는다.
	int x ;
	int y ;
	//가지고 있는 두수를 이용해서 사칙연산을 수행한다.
	public Ex03_Calculator(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	void plus() {
		System.out.println(x+y);
	}
	void minus() {
		System.out.println(x-y);
	}
	void mul() {
		System.out.println(x*y);
	}
	void div() {
		System.out.println((double)x/y);
	}
	//x와 y 두수 사이의 합을 구하는 메소드
	void test() {
		int sum = 0;
		for (int i = x+1; i < y; i++) {
			System.out.println("두수사이의 수"+i);
			sum += i;
		}
		System.out.println("누적합 :" + sum);
	}
	//※반드시※ Ex03_Calculator라는 객체는 생성시에 숫자 두개를 입력 받아야 한다.
	
}
