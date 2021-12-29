package pack02_Array;

public class Ex06_2Array {
	public static void main(String[] args) {
		//2차원배열 == 1차원배열을 요소로 가진 배열 ※ 핵심
		//1차원 배열을 만들어서 2차원 배열에 넣을 수 있을까?
		int[] arr1 = new int[10];
		int[] arr2 = new int[8];
		int[] arr3 = new int[5];
		//2차원배열의 행의크기만 지정하고 크기할당 끝낸다.
		//2[	[1차원배열][][][]  ]
		//1[	[1차원배열][][][]  ]
		//0[	[1차원배열][][][]  ]
		int[][] arrs = new int[3][]; //행의 크기만 지정한 상태(1차원배열 x)
		arrs[0] = arr1;
		arrs[1] = arr2;
		arrs[2] = arr3;
		
		//배열의 크기 만큼 별 찍는 for문
		//0[10], 1[8], 2[5] ->비정방형
		for(int i = 0 ; i < arrs.length ; i++) {
			for(int j = 0 ; j < arrs[i].length ; j++) {
				System.out.print("★");
			}System.out.println();
		}
	}
}
