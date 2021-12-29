package pack02_Array;

public class Ex01_Array {
	public static void main(String[] args) {
		// String , 배열 == ( 참조 타입 )
		int a = 10;
		int b = 20;
		int c = 30;
		// 100.... ?
		// int[] array = < 100
		// 배열의 선언
		// 데이터타입[] 배열의 이름 ;
		// 배열의 크기를 할당
		// 배열의이름 = new 데이터타입[크기int로 넣어줌];
		int[] array;// <선언
		array = new int[3];// 배열의 크기 할당.
		// 배열의 크기를 할당했을때 그 크기를 n의 크기라고 봤을때
		// 배열이 가지는 주소(인덱스)는 0부터 n-1 까지 이다.
		// ex) 3<-크기 3 -1 = 0~2
		// System.out.println(array);
		// 배열에 값을 할당하는 방법.
		array[0] = 1;
		array[1] = 2;
		// 배열의 값을 이용하는 방법
		// 행복사 : ctrl + alt + 방향키
		System.out.println("array[0] : " + array[0]);
		System.out.println("array[1] : " + array[1]);
		System.out.println("array[2] : " + array[2]);

		String[] strArray;
		strArray = new String[4];
		strArray[0] = "k";
		strArray[1] = "y";
		strArray[2] = "m";
		System.out.println(strArray[0]);
		System.out.println(strArray[1]);
		System.out.println(strArray[2]);
		System.out.println(strArray[3]);
		// " "; // null
		if (strArray[3] != null) {
			if (strArray[3].equals("k")) {
				System.out.println("k가 맞습니다.");
			}
		}else {
			System.out.println("str[3]은 비어있다(null)");
		}
		// n - 1 == 4 - 1 == 3
		// String 데이터 타입의 배열을 만든다.
		// 배열의 크기는 4개이고 . 배열의 마지막 인덱스(주소)는 값을 할당하지 않는다.
		// 배열의 첫번째부터 3개의 인덱스(주소)에는 자신의 이니셜을 한글자씩 넣는다.
		// 콘솔창에 출력.

	}// main
}
