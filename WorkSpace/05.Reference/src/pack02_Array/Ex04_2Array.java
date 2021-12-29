package pack02_Array;

public class Ex04_2Array {
	public static void main(String[] args) {
		//1차원  array[3] : [0] [1] [2]
		//2차원  array[2][3] : 1[0] [1] [2]
		//						0[0] [1] [2]	
		//2차원 배열의 선언, 데이터타입 [][] 배열의 이름'
		int[][] arr; //<- int형 2차원 배열선언
		arr = new int[2][3]; // 행 * 열 = 6
		System.out.println("행의 크기 " + arr.length);//행의 크기 조회
		System.out.println("열의 크기 " + arr[0].length);//열의 크기 조회
		System.out.println("열의 크기 " + arr[1].length);//열의 크기 조회
		System.out.println(arr[0][0]);//위치 조회
		//2차원 배열의 값을 할당
		//행마다 열의 수가 다를 수 있다.
		arr[0][0] = 1;//1[4][5][6] <-값을 할당.
		arr[0][1] = 2;//0[1][2][3]
		arr[0][2] = 3;
		//arr[0][3] = 4;//값을 가지고 올 수 없음.
		arr[1][0] = 4;//1[4][5][6]
		arr[1][1] = 5;
		arr[1][2] = 6;
		//for == 1차원 배열 끝까지 접근 가능//
		//for문을 두개 사용해서 2차원 배열의 모든 값을 콘솔창에 출력
		//ex) 1차원 배열 -> for length(1차원 배열의 크기)
		//ex) 2차원 배열 -> for , for
		for(int i = 0 ; i < arr.length ; i++) {//모든 1차원 행에 접근
			for(int j = 0 ; j < arr[i].length ; j++) {
				//모든 열에 접근(조건식 1차원 배열의 열의 크기를 지정해 놓는다.)
				System.out.println(arr[i][j]);
			}
		}
		
	}
}
