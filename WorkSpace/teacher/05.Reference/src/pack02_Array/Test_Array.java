package pack02_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Test_Array {
	public static void main(String[] args) {
		//1.문제 ) int[] arr = {1,4,6,9,8,5,2,7,3}
		//홀수의 합과 짝수의 합을 구해서 출력하시오.
		//홀수 %2 == 1 , 
		//제어문을 사용해서 출력하시오.↑※
		//for문하나를 이용하면 모든 index에 접근이 가능하다.
		//제어문은 중첩이 된다.(for안에 if) (if안 for)
		//int oddSum , evenSum <-  
		//oddsum = oddsum+ ?;
		int oddSum = 0 ;//홀수의합 저장용 변수
		int evenSum = 0 ; //짝수의합 저장용 변수
					//oddSum = oddSum + 30 ;
		int[] arr = {1,4,6,9,8,5,2,7,3};
		//[1][4][6][9][8][5]
		// 0  1  2  3  4  5 ...... arr.length-1
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			if(arr[i]%2==1) {
				//누적 (합)
				//oddSum += arr[i];//0~index
				oddSum = oddSum + arr[i];
			}else {
				//evenSum += arr[i];
				evenSum = evenSum + arr[i];
			}
		}
		System.out.println("홀수의합:" + oddSum);
		System.out.println("짝수의합:" + evenSum);
		//2.문제) arr를 정렬하시오 {1,2,3,4,5,6,7,8,9}
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
