import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//2021-09-15 6교시 수업중 <-
		//syso 
		//ctrl + space = 소스 자동완성 도우미 
		//더블 코테이션 = 쌍따옴표 = "이사이에 문자를 입력하면 문자열이된다."
		//== String(문자열 데이터 타입)
		//ctrl + shift + s = 소스 전체 저장
		System.out.println("문자열 데이터를 출력");
		//변수를 사용하는 방법
		//변수타입 변수명 ;<-변수 선언 식
		int x ; //<-변수를 선언 함
		x = 30 ; //변수에 값을 할당함(현재 30이라는 값을 변수 x에 할당함)
		System.out.println(x);//콘솔창에 현재 진행중인 
		//변수에 값을 재할당 (기존에 있던 값을 비우고 새로운값을 할당함)
		x = 50 ;
		System.out.println(x);
		
		//문자열을 저장할수있는 변수타입 String
		String str = "변수를 선언과 동시에 값을 대입하는것 초기화" ;
		System.out.println(str);
		
		//실수형(소수) 데이터를 담는 대표적인 데이터타입 double
		double d = 3.14;
		System.out.println(d);
		
		//부울형(논리) boolean 참 , 거짓 두가지 데이터만 사용가능 참=1 ,거짓=0
		//true , false
		boolean bool = false;
		System.out.println(bool);
		
		//Escape 탈출 , 문자열 내부에서 어떠한 문자들은 사용이 불가능하다
		// "<문자열의 시작     문자열의끝>"   문자열의끝>"
		// Escape문자는 \
		// Escape문자를 앞에 더해서 해당하는 문자는 문자열 내부에 문자일뿐이다.
		System.out.println(" \"개발자\" ");
		//" 쌍따옴표를 문자열의 끝 또는 시작으로 인식하라는게 아니라 
		//문자열 내부에 문자일 뿐이라는 Escape표시를 했다.
		System.out.println("\\개발자\\");
		
		//Scanner 콘솔창에 어떠한 데이터를 입력 받아서 처리하기위한 기능.
		Scanner sc = new Scanner(System.in);
		String inputData1 , inputData2 , inputData3 ;
		inputData1 = sc.nextLine();
		inputData2 = sc.nextLine();
		inputData3 = sc.nextLine();
		System.out.println(inputData1);
		System.out.println(inputData2);
		System.out.println(inputData3);
	}
}
