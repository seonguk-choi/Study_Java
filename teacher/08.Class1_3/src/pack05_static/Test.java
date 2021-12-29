package pack05_static;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//반드시 사용자가 숫자를 입력하게 만드는 메소드.
		System.out.println("사용자가 입력한 수:" + rtn_int());
		int [] intArr = new int[rtn_int()];
	}
	static int rtn_int() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				int rtn_num = Integer.parseInt(sc.nextLine());
				return rtn_num;
			}catch (Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
	}
}
