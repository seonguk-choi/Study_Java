package pack02_Array;

import java.util.Scanner;

public class Test01_Array {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// sc.nextLine()을 이용해서 숫자 세개를 입력받는다.(Enter Key)
		// 입력받은 값을 int[]형 배열에 넣고 그값을 출력하시오.
//		Scanner sc = new Scanner(System.in);
//		String data1 = sc.nextLine();//
//		String data2 = sc.nextLine();//
//		String data3 = sc.nextLine();//
//		System.out.println(data1 + data2 + data3);
//		int[] array = new int[3];//0
//		array[0] = Integer.parseInt(data1);//data1==String => int
//		array[1] = Integer.parseInt(data2);//data2==String => int
//		array[2] = Integer.parseInt(data3);//data3==String => int
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[2]);
//============>반복되는 구간 (1씩증가) 되는 부분을 파악하고 반복문으로 바꾸기.
		int[] array = new int[3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			String data = sc.nextLine();
			array[i] = Integer.parseInt(data);
			System.out.println(array[i]);
		}
		// for문을 이용하시오.※
		// int array |int<-?<-String
		// array[0] = <=sc.nextLine() "1" => 1
		// array[1] = <=sc.nextLine()
		// array[2] = <=sc.nextLine()
		// syso(array[0] + "" + array[1] + ""+ array[2])

	}
}
