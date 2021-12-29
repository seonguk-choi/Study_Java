package pack02_Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test_Array {
	public static void main(String[] args) {
		//1.문제 ) int[] arr = {1,4,6,9,8,5,2,7,3}
		//홀수 합과 짝수의 합을 구하세요
		int[] arr = {1,4,6,9,8,5,2,7,3};
		int oddSum = 0;
		int evenSum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i]%2 ==0) {
				evenSum += arr[i];
			} else {
				oddSum += arr[i];
			}
		}System.out.println("짝수의 합 : " + evenSum);
		 System.out.println("홀수의 합 : " + oddSum);
		
		//2.문제 arr를 정렬하시오 {1,2,3,4,5,6,7,8,9}
		 /*for (int j = 0; j < arr.length; j++) {
			for (int k = j+1; k < arr.length; k++) {
				if(arr[j] > arr[k]) { //오름차순
					int temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}
			}
		}System.out.println(Arrays.toString(arr));*/
		 for(int h = 0 ; h <arr.length ; h++) {
			 for(int l = h+1 ; l <arr.length ; l++) {
				 if(arr[h] > arr[l]) {
					 int temp = arr[h];
					 arr[h] = arr[l];
					 arr[l] = temp;
				 }
			 }System.out.println(arr[h]);
		 }
	}
}
