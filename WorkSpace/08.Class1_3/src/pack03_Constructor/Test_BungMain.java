package pack03_Constructor;

public class Test_BungMain {
	public static void main(String[] args) {
		//배열 
		//데이터타입[] 배열의이름 = new 배열데이터타입[size];
		//int[] intArr = new int[3]
		//String[] strArr = new String[3];
		Test_Bung[] testB = new Test_Bung[5];//크기 - 1
		testB[0] = new Test_Bung("팥", 1000, "팥붕어빵", "2021-10-06");
		testB[1] = new Test_Bung("팥", 1000, "팥붕어빵", "2021-10-06");
		testB[2] = new Test_Bung("팥", 1000, "팥붕어빵", "2021-10-06");
		testB[3] = new Test_Bung("팥", 1000, "팥붕어빵", "2021-10-06");
		testB[4] = new Test_Bung("팥", 1000, "팥붕어빵", "2021-10-06");
	}
}
