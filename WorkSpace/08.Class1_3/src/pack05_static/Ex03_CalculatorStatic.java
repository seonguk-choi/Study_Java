package pack05_static;

public class Ex03_CalculatorStatic {
	
	static void plus(int x , int y) {
		System.out.println("x와 y의 합 : " + (x + y));
	}
	static void minus(int x , int y) {
		System.out.println("x와 y의 차 : " + (x - y));
	}
	static void mul(int x , int y) {
		System.out.println("x와 y의 곱 : " + (x * y));
	}
	static void div(int x , int y) {
		System.out.println("x와 y의 분 : " + ((double)x / y));
	}
}
