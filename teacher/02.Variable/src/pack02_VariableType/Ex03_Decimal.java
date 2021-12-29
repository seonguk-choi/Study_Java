package pack02_VariableType;

public class Ex03_Decimal {
	public static void main(String[] args) {
		//int i =  3.5; 정수형 데이터타입 int에는 일반적인 방법으로는
		//소수데이터를 담을수가 없다.
		//따라서 후에 배우는 캐스팅이라는 기능을 사용하면 된다.
		
		//실수형 기본 데이터 타입 : float , double※
		float f = 123.04567890123123123F;
		//L과 마찬가지로 뒤에 F를 붙여줘야만 한다.
		//데이터를 절삭시키기 때문에 데이터의 정합성을 판단하기 어렵다.
		System.out.println(f);
		//int 정수 , double 실수형 
		double d = 123.045678;
		System.out.println(d);
	}
}
