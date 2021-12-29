package pack02_Array;

import java.util.Scanner;

public class Text01_Array {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//sc.nextLine()을 이용하여 숫자 세개 입력 (Enter Key)
		//입력받은 값을 int[] 형 배열에 넣고 그값을 출력
		Scanner sc = new Scanner(System.in);
		
		//for문을 이용
		//int array
		//array= <= sc.nextLine()
		//syso(arra[0] = <= sc.nextLine()
		//array[1] = <= sc.nextLine()
		//array[2] y[0] + "" +array[1] + "" array[2])
		/*String data1 = sc.nextLine();
		String data2 = sc.nextLine();
		String data3 = sc.nextLine();
		int[] array = new int[3];
		array[0] = Integer.parseInt(sc.nextLine());
		array[1] = Integer.parseInt(sc.nextLine());
		array[2] = Integer.parseInt(sc.nextLine());
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);*/
	//----반복되는 구간 (1씩증가) 되는 부분을 파악하고 반복문 사용
		int[] array = new int[Integer.parseInt(sc.nextLine())];
		for(int i = 0 ; i < array.length ; i++) {
			String data = sc.nextLine();
			array[i] = Integer.parseInt(data);
			System.out.println(array[i]);
		}
		
	
	
	}
}
