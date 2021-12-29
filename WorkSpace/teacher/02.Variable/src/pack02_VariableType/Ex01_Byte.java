package pack02_VariableType;

public class Ex01_Byte {
	public static void main(String[] args) {
		//Byte(바이트) 는 관련된 8개의 bit(비트)들로 구성이 된다.
		//bit는 0또는 1로 두가지 정보를 표현하는 최소의 정보 표현 단위.
		//정수가 한 바이트에 표현 될 경우에는 그 값의 범위이다.
		//즉 최대값은 127이고  , 최소값 -128이다.
		//공장 <-> byte plc
		//여기 부분은 따로 복습 안하셔도 됩니다.
		byte var1 = -128; //byte로 나타낼수있는 최소값
		byte var2 = -30;
		byte var3 = 127; //byte로 나타낼수있는 최대값
		System.out.println("var1 의 값은 : " + var1);
		System.out.println("var2 의 값은 : " + var2);
		System.out.println("var3 의 값은 : " + var3);
		
		
	}
}
