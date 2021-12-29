package pack01_OOP;

public class Student02 {
	//필드에 바로접근을 막고 (접근제한자를 이용함)
	//Student s1 = new Student();
	//s1.name = "" <= x
	//s1.kor = -1 ; <= -1이라는 점수는 사실상 논리적으로 입력할수 없는값.
	//메소드 처리.( 필드에 접근하기위해서는 항상 값을 세팅할때는 setter
	//		값을 가져갈때는 getter라는 메소드를 이용해서만 접근하게 만드는 기법)
	String name;
	int kor , math , eng , sum;
	double avg;
	//setter는 99% void형태다 값을 return하는 경우가 없다.
	void setName(String name) {
		//생성자 메소드는 생성할때 값을 한번에 setting하는 개념이라면
		//getter & setter는 필드 하나씩 접근해서 setting하는 바
		if(name == null || name.length() == 0) {
			this.name = "이름 입력안됨";
		}else {
			this.name = name;
		}
	
	}
	
	void setKor(int kor) {
		if(kor < 0) {
			this.kor = 0;
		}else {
			this.kor = kor;
		}
	}
	int getKor() {
		return kor;
	}
	
}
