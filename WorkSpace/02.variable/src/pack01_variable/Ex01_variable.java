package pack01_variable;

public class Ex01_variable {
	public static void main(String[] args) {
		int choi; //변수의 선언
		choi = 10;
		System.out.println(choi);
		
		int seong;
		seong = 50;
		System.out.println(seong);
		
		int a = 100;
		System.out.println(a);
		a = 50;
		System.out.println(a);
		
		int x = 10;
		int y = x;
		int z = y;
		int g = z;
		x = z;
		System.out.println(z);
	}//main
}//class
