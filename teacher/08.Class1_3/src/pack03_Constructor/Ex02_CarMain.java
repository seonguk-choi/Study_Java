package pack03_Constructor;

public class Ex02_CarMain {
	public static void main(String[] args) {
		//Ex02_Car 를 인스턴스화 하고 속성을 출력.
		//Ex02_Car 이름 = new Ex02_Car();
		//별도로 생성자 메소드를 만들지 않았을때 기본으로 제공하는 생성자 메소드
		//호출 - 정의 해놓은 규칙을 맞춰서 불러야된다.
		//ex)Ex02_Car(생성자메소드) ;
		//-5개의 값을 줘야지만 호출할수있다.(String타입으로 3, int 2)
		Ex02_Car car = new Ex02_Car(null,"값2","값3",10,20);
		System.out.println(car.color);
		System.out.println(car.company);
		System.out.println(car.model);
		System.out.println(car.maxSpeed);
		System.out.println(car.speed);
	}
}
