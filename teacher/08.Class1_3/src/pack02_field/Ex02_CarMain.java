package pack02_field;

public class Ex02_CarMain {
	public static void main(String[] args) {
		//main 메소드가 없으면 java소스파일은 실행안됨.
		//Ex02<객체를 인스턴스화(사용준비)를 하면 객체의 속성들을 이용할수가 있다.
		//Ex02_Car를 인스턴스화 (객체화) 하세요.
		Ex02_Car car = new Ex02_Car();//사용 준비 완료(객체화 , 인스턴스화)
		System.out.println(car.model);
		System.out.println(car.company);
		System.out.println(car.color);
		//
		car.color = "빨강";
		System.out.println(car.color);
		System.out.println(car.speed);
		System.out.println("사람이 타서 엑셀을 밟았습니다.");
		car.speed = 50;
		System.out.println(car.speed);
		//사람이 타서 엑셀을 밟았을때 속도가 50이라고 바뀌게 작업.
		
	}
}
