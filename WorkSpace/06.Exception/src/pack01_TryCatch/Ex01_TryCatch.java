package pack01_TryCatch;

import java.util.Scanner;

public class Ex01_TryCatch {
	public static void main(String[] args) {
		//3개의 길이(크기) 정수형 배열을 만든다.
		//실제로 있지 않은 공간에 값을 할당해보자.(예외발생)
		//try catch를 이용하여 예외처리 가능
		//try 블럭은 시도한다. (내 코드가 될지 안될지 모르지만 실행함)
		//catch <- 예외가 발생하는 순간 catch의 식이 실행됨(예외를 잡음)
		//try와 catch의 지역이 다르다. 변수를 각 지역에만 사용가능하다.
		try {
			int[] arr = new int[3];
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[7] = 40;
		}catch (Exception e) {
			System.out.println("배열인덱스에 잘 못 접근했습니다.");
		}
		//int number = 스캐너로 입력받은 값.
		//입력은 계속 해서 받는다.
		//단, 숫자외에 값이 입력되는 경우, 숫자값을 입력해주세요 출력
		//-1값이 들어오면 프로그램 종료
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				int number = Integer.parseInt(sc.nextLine());
				if(number == -1){
					System.out.println("종료합니다.");
					break;
				}
			}catch (Exception e) {
				System.out.println("숫자 값을 입력해주세요.");
			}
		}
	}
}
