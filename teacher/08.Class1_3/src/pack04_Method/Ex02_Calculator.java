package pack04_Method;

public class Ex02_Calculator {
	//계산기의 전원을 킨다.
	//어떤값을 반환하지 않는.
	//void가 아닌 메소드 == sc.nextLine() == String값을 반환하는.
	void powerOn() {
		System.out.println("계산기의 전원을 킵니다.");
	}
	//리턴타입 메소드이름(파라메터 있으면 넣고 없으면 생략){
	//}
	
	//리턴 타입이 있으면 반드시 해당하는 데이터타입으로 return 데이터타입 ; 이 있어야한다.
	int rtn_int() {
		return 10;
	}
	//메소드 호출시 넘겨주는 int 두개를 메소드에서 계산을 완료하고 
	//그결과를 다시 호출하는 부분으로 넘겨주겠다.
	int plus(int x , int y ) {
		System.out.println(x+y);
		return (x+y);
	}
	int mul(int x , int y) {
		return (x*y);
	}
	int mul(int x , int y , int z) {
		return (x*y*z);
	}
	double divide (int x , int y) {
		return ( (double) x /  y );
	}

	
	
	
}
