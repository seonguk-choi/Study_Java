package pack02_Array;

public class Ex07_sort {
	public static void main(String[] args) {
		int a = 10;
		int b = 20; 
		int temp = 0;//임시로 어떤값을 저장해 놓는다.
					//값을 할당하면 이전에 있던 값이 사라지고 새로운값이 들어옴.
		System.out.println("변경 전 a의 값 : " +  a + " b의값 :" + b);
		//temp = b;
		//b = a;
		//a = temp;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("변경 후 a의 값 : " +  a + " b의값 :" + b);
		
		//swap
		//a와b에 직접 값을 할당하지 않고. (변수사용은 가능)
		//두수의 값을 바꿔보세요.
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6};
		int[] tempArr = arr1;//arr1에 있는값을주고 1차원배열 초기화
		arr1 = arr2;
		arr2 = tempArr;
		//둘중에 하나를 임시로 저장을 해놓아야 바꿀수있다.(1:1교환 x)
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] + " " + arr2[i]);
		}
	}
}
