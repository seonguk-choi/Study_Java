package pack02_Array;

public class Ex07_sort {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp = 0;//임시로 값을 저장
					//값을 할당하면 이전에 값이 사라지고 새로운 값 들어옴.
		System.out.println("a의 값 : " + a + " b의 값 : " + b);
		
		temp = a;
		a = b;
		b = temp;
		// = 같다가 아니라 보낸다는 개념으로 생각하자.
		// temp = a; a값을 temp로 보낸다.
		System.out.println("a의 값 : " + a + " b의 값 : " + b);
		//swap
		//a와 b에 직접 값을 할당하지 않고
		//두수의 값을 바꿔보세요
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {4, 5, 6};
		int[] tempArr = arr1;
		arr1 = arr2;
		arr2 = tempArr;
		//임시로 저장해 놓아야 바꿀수 있다.(1:1교환 안된다)
		for (int i = 0; i < arr1.length; i++) {
			/*int[] tempArr = arr1;
			arr1 = arr2;
			arr2 = tempArr;*/ //for문 조건식이 되는 동안 계속 바뀐다.
			System.out.println(arr1[i] + " " +arr2[i]);
		}
	}
}
