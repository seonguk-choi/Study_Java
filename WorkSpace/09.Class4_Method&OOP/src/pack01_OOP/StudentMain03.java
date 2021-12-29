package pack01_OOP;

public class StudentMain03 {
	public static void main(String[] args) {
		Student03 s1 = new Student03();
		s1.setName("홍길동");
		s1.setKor(100);
		s1.setEng(30);
		s1.setMat(10);
		System.out.println(s1.getName());
		System.out.println(s1.getKor());
		System.out.println(s1.getEng());
		System.out.println(s1.getMat());
		System.out.println(s1.getSum());
		System.out.println(s1.getAvg());
	}
}
