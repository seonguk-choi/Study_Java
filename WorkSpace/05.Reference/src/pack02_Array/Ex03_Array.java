package pack02_Array;

public class Ex03_Array {
	public static void main(String[] args) {
		//배열은 반복문(for, while)을 사용하면 편리하다.
		int[] array = new int[3];
		/*array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		사용하기 불편함. 변수사용과 비슷함*/
		//i<=2 == i<3
		for(int i =0 ; i<3; i++) {
			array[i] = 2;
			//array[0] = 2;
			//array[1] = 2;
			//array[2] = 2;
			System.out.println(i + "번 index: " + array[i]);
		}
		//반복문을 통해 array[i] <- 0~2 indexRKwl
		//전부 값을 할당(2)
		//for문의 값 할당부분을 수정하여
		//0번 index : 10 , 1번 index : 20, 2번 index : 30
		for(int i =0 ; i<3; i++) {
			array[i] = i*10+10;//(i+1)*10
			System.out.println(i + "번 index: " + array[i]);
		}
		
		//배열의 크기를 얻어오는 함수.
		System.out.println(array.length);
		int[] array2 = new int[10];
		for(int i = 0 ; i<array2.length; i++) {//index 오류가 절대 안나는 for문	
			array2[i] = i+1;
			System.out.println(array2[i]);
		}
	}
}
