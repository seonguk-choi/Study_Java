package pack01_OOP;

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student();//인스턴스화 
		s1.name = "학생1";
		s1.kor = 10;
		s1.mat = 20;
		s1.eng = 30;
		s1.setSum();
		s1.setAvg();
		//s1.display();
	}
}
