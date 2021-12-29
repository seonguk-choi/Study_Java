package pack01_OOP;

public class StudentMain02 {
	public static void main(String[] args) {
		Student02 s1 = new Student02();
		s1.name = null;//필드에 바로 접근해서 넣으면 안되는 값을 셋팅해도 그래도 값이 대입됨.
		s1.setNume(null);
		s1.kor = -100;
		s1.setKor(-100);
		System.out.println(s1.name);
		System.out.println(s1.kor);
	}
}
