package pack04_Boolean;

import java.util.Scanner;

public class Ex02_TestCasting {
	public static void main(String[] args) {
		int a = 1;
		System.out.println(a);
		int b = 10;
		System.out.println(b);
		byte c = 20;
		int d = (int) c;
		System.out.println(d);
		int e = 50;
		byte f = (byte) e;
		System.out.println(f);
		
		byte h = 1;
		int i = (int) h;
		System.out.println(i);
		int j = 129;
		byte k = (byte) j;
		System.out.println(k);
	}
}
