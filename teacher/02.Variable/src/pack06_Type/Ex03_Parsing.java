package pack06_Type;

public class Ex03_Parsing {
	public static void main(String[] args) {
		//String 변수를 이용하여 문자 10(str1)과 문자 20(str2)를 더하기 연산.
		//10 + 20 = 30;
		String str1 = "10";//<-숫자 10이 아니라 문자 10
		String str2 = "20";//<-숫자 20이 아니라 문자 20
		System.out.println(str1 + str2);
		//String변수에 어떤 변수든 + 를 이용하면 더하기 연산을 하는게아니라
		//연결이 된다 ( Concatenation(연결 , 결합 ) )
		
		//문자형 데이터 String - > int형으로 바꾼다. (Casting , Parsing);
		//바꾼 결과를 담을수있는 int변수를 선언하고 그변수에 String값을int로
		//바꿔서 바로 할당. (초기화)
		//Wrapper Class 를 이용하여 str1 -> int num1 담길수있는 int형이 된다.
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		System.out.println(num1+num2);
		//num1과 num2 숫자형 데이터
		System.out.println(num1+""+num2);//1020
		//정수형이나 다른 어떤 데이터타입을 String으로 바꾸는 방법은
		//String임을 나타내는 쌍따옴표(더블코테이션)를 더해주면 된다.
	}
}
