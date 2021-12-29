package pack05_Escape;

import java.util.Scanner;

public class Ex02_scanner {
	public static void main(String[] args) {
		//scanner sc(변수명) = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();//enterkey 한 번 입력
		System.out.println(inputData);
		inputData = sc.nextLine(); // enterkey
		System.out.println(inputData);
		
	}
}
