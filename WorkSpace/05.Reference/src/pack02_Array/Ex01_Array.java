package pack02_Array;

public class Ex01_Array {
	public static void main(String[] args) {
		//String, 배열 == (참조타입) -> 스택영역이 아닌 힙영역에 값이 있다.
		int a = 10;
		int b = 20;
		int c = 30;
		//100.....?
		//int[] array = < 100 한곳에 100개를 넣어두고 찾아씀
		//데이터를 아파트 처럼 만드는 것
		//배열의 선언
		//데이터타입[] 배열의 이름 ;
		//배열의 크기를 할당
		//배열의 이름 = new 데이터타입[크기int로 넣어줌];
		int[] array ;//선언
		array = new int[3]; //배열의 크기
		//배열의 크기(n)를 할당할 때
		//배열의 주소(인덱스)는 0 ~ n-1 까지
		//ex) 배열 크기 3 -> 인덱스 0~2
		System.out.println(array);
		//배열의 값을 할당하는 방법.
		//인덱스에 값을 안넣어도 데이터타입이 들어있음 ex [int], [String]
		//System.out.println(array);
		//배열에 값을 할당하는 방법
		array[0] = 1;
		array[1] = 2;
		//배열의 값을 이용하는 방법
		//행복사 ctrl + alt + 방향키
		System.out.println("array[0] : " + array[0]);
		System.out.println("array[1] : " + array[1]);
		System.out.println("array[2] : " + array[2]); //값이 없다면숫자형은 0이 자동으로 할당 됨.
		
		//String 데이터 타입의 배열을 만든다.
		//배열의 크기는 4개이고, 배열의 마지막 인덱스는 값을 할당하지 않는다.
		//배열의 첫번째부터 3번째까지 이니셜을 한글자씩 넣는다.
		//콘솔창에 출력
		String[] strArray;
		strArray = new String[4];
		strArray[0] = "C";
		strArray[1] = "S";
		strArray[2] = "U";
		
		System.out.println("arr[0] :" + strArray[0]);
		System.out.println("arr[1] :" + strArray[1]);
		System.out.println("arr[2] :" + strArray[2]);
		System.out.println("arr[3] :" + strArray[3]);
		//" "; -> 공백 값이 있음
		//null -> 비어있다. 값이 없다.
		/*if(strArray[3].equals("C")) {
			System.out.println("C가 맞습니다.");
		}*/
		//null은 비교할 수 없다. NullPointException -> 개발자가 처리 가능한 오류
		//
		if(strArray[3] != null) {//null을 우회하는 방법
			if(strArray[3].equals("C")) {
				System.out.println("C가 맞습니다.");
			}
		}else {
			System.out.println("str[3]은 비어있다.(null)");
		}
	}
}
