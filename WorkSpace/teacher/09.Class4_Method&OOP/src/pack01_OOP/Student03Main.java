package pack01_OOP;

public class Student03Main {
	public static void main(String[] args) {
		//Setter & getter 만 이용해서 필드에 접근하고 값을 세팅, 출력
		Student03 s1 = new Student03();//인스턴스화를 함.
		//s1.name = "홍길동"; //<= 필드에 바로 접근하기때문에 아무 값이나 넣을수있음 x
		int a = 100;
		s1.setName("홍길동");
		s1.setKor(100);
		s1.setMath(30);
		s1.setEng(10);
		System.out.println(s1.getName());
		System.out.println(s1.getKor());
		System.out.println(s1.getMath());
		System.out.println(s1.getEng());
	}
}
