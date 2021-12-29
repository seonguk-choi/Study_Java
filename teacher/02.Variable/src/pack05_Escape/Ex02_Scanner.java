package pack05_Escape;

import java.util.Scanner;

//java에서 미리 정의해놓거나 
//외부에 있는 기능들을 해당하는 .java파일에서 사용할수있게 기능을 추가해주는
//명령어(예약어) 이다.

public class Ex02_Scanner {
	public static void main(String[] args) {
		//Scanner <- 사용자가 (개발자) 콘솔창에 입력한 값을
		//우리의 소스코드의 메모리에 올라와있는 변수에 담아서 사용하거나
		//콘솔창에 다시 출력할수있게끔 해준다.
		//스캐너 타입을(클래스형태로) Scanner (반드시 자동완성을 이용함.)
		//import를 자동으로 이클립스에서 해주기 때문이다.
		//Scanner sc(변수명) = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);//스캐너의 초기화식
		String inputData = sc.nextLine();//enterkey를 입력을 한번.
		System.out.println(inputData);
		inputData = sc.nextLine(); //enterkey 
		System.out.println(inputData);
		//Class를 추가합니다.
		//Ex03_ScannerTest <-
		//Scanner로 세가지 데이터를 입력받아 콘솔창에 출력하세요.
		//입력받는 순서나 출력하는 순서는 자유롭게 하시면 되는데.
		//각각 세가지 데이터는 다른 변수 입니다.
		
	}
}
