import java.util.Scanner;

public class Ex08_Testbool {
	public static void main(String[] args) {
		//Scanner를 통해 숫자 두개 입력받는다.
		//입력된 값 두개가 같은지 다른지 비교
		Scanner sc = new Scanner(System.in);
		//sc.nextLine() x2 <- String -> int(integer == Wrapper Class)
		System.out.println("입력해주세요");
		String str1 = sc.nextLine();
		System.out.println("한 번 더 입력해주세요");
		String str2 = sc.nextLine();
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		boolean boolResult = num1 == num2 ? true : false;
		//String boolResult = num1 == num2 ? "true" : "false";
		System.out.println(boolResult);
		System.out.println("num1과 num2가 같은지? " + (num1 == num2 ? "같다" : "다르다"));
		System.out.println("num1과 num2가 다른지? " + (num1 != num2 ? "다르다" : "같다"));
		System.out.println("num1과 num2중 num1이 큰지? " + (num1 > num2 ? "네" : "아니오"));
		//num1과 num2 중에 num2가 큰지?
		System.out.println("num1과 num2중 num2이 큰지?(초과) " + (num1 < num2 ? "네" : "아니오"));
		System.out.println("num1과 num2중 num2이 큰지?(이상) " + (num1 <= num2 ? "네" : "아니오"));
		
		if(num1 == num2) {
			System.out.println("nu1 과 num2 같다");
		}
	}
}
