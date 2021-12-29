package pack05_Escape;

public class Ex01_EscapeVar {
	public static void main(String[] args) {
		// tab  
		System.out.println("번호\t이름\t직업");
		//만약에
		//\<-이스케이프 문자를 출력하고싶을때는 이스케이프 문자를 두번입력하면
		//하나의 이스케이프 문자라고 인식을 한다.
		System.out.println("\\");
		//print ( ln ) line new ( 줄바꿈을 의미한다) print<줄바꿈이 빠져있기때문에
		// 같은 라인에 계속 출력이 됨.
		System.out.print("a\n");//줄바꿈
	
		
		System.out.println("|\\_/|");
		System.out.println("|q p |\t /}");
		System.out.println("( 0  )\"\"\"\\");
		System.out.println("|\"^\"'\t|");
		System.out.println("||_/=\\\\__|");
		System.out.println("우리는 \"개발자\" 입니다. ");
		//"문자열의시작<  문자열의 끝>" + "문자열의시작" + "문자열의끝"
//		|\_/| |\_/|
//		|q p|   /}
//		( 0 )"""\
//		|"^"`    |
//		||_/=\\__|
	}
}
