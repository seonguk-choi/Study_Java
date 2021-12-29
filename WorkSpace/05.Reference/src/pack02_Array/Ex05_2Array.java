package pack02_Array;

public class Ex05_2Array {
	public static void main(String[] args) {
		//2차원 배열은 요소로(구성) 1차원 배열을 가지고 있다
		//1차원 배열은 값(데이터타입)을 요소로 가지고 있다.
		//int[] arr = { 1, 2, 3, 4 }; 
		//2차원 배열에 크기 할당과 동시에 값을 할당하는 방법
		int[][] arr = {
				{1,2},				//2
				{3,4,5},			//3
				{6,7,8,9},			//4
				{10,11,12,13,14},	//5
		};
		System.out.println(arr.length);//총행의 갯수 출력
		System.out.println(arr[3].length);//3번째에 요소로 있는 1차원 배월의 크기(열크기)
		
		//arr<2차원 배열의 모든 내용을 for문을 통해 출력
		//ex) 모든 행에 접근하는 for
		//		모든 열에 접근하는 for
		for(int i = 0 ; i <arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				//↑ 모든행에 접근
				System.out.println(arr[i][j]);
				
			}
		}
	}
}
