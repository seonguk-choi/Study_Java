package pack01_variable;

public class Ex02_variable {
	public static void main(String[] args) {
		//int a = 10;
		//int b = 20;
		int a = 10 , b = 20;
		System.out.println("변수 a의 값 : " + a);
		System.out.println("변수 b의 값 :"+ b);
		
		int c = a , d = b;
		System.out.println("변수 c의 값 : " + c);
		System.out.println("변수 d의 값 :"+ d);
		a = 30;
		b = 40;
		System.out.println("변수 a의 값 : " + a);
		System.out.println("변수 b의 값 :"+ b);
		
		c = a;
		d = b;
		System.out.println("변수 c의 값 : " + c);
		System.out.println("변수 d의 값 :"+ d);
	}//main()
}//class()
