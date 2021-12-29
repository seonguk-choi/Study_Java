package pack02_Array;

public class Ex02_Array {
	public static void main(String[] args) {
		//int[] array; 			int a;
		//array = new int[3];	a = 10;
		//초기화 ? 선언과 할당을 동시에 하는 것.
		//1.배열의 초기화식 (변수의 초기화식 : int a = 10;)
		//크기 할당까지만 초기화함.(변수의 기본값을 가지고 있는 상태로 만듬)
		int[] array = new int[4];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		
		//2.배열의 초기화식
		//String배열을 이용해도 null값을 회피할 수 있다.
		//String[] array2  = {"0번", "1번", "2번"}; //간단하게 사용할 때만 타자로 쳐야해서 길게는 못함
		
		//세숫자의 총합과 평균을 구하시오.
		System.out.println(array[0] + array[1] + array[2]);
		System.out.println((array[0] + array[1] + array[2])/3);
		if(array[3] != 0) {
			System.out.println((array[0] + array[1] + array[3])/3);
		}else {
			System.out.println("error");
		}
		
		
	}
}
