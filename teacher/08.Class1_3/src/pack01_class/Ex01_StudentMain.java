package pack01_class;

public class Ex01_StudentMain {
	int aaa ;//필드 , 클래스 멤버 , 인스턴스 변수
	public static void main(String[] args) {
		String aa = ""; //지역변수 (메소드 변수)
		//Ex01_Student라는 Class를 인스턴스화(객체화)하기. 메모리에 올려서 사용할수있게 만들기.
		//변수 초기화(사용할준비) int a = 0 ; <0이라는 값을 가지고 초기화
		//참조 변수 초기화(사용할준비) int[] a = new int[size];
		//Class이름 ,클래스를 객체화해서 사용할 이름(변수명) = new Class이름;
		Ex01_Student kym = new Ex01_Student();//인스턴스화(객체를 사용할준비)
		System.out.println("s1 이라는 객체는 값이 무엇일까요? " + kym);
		Ex01_Student kym2 = null;//레퍼런스 타입은 null로 비워둘수있다.
		Ex01_Student kym3 = null;
		if(kym2 == kym3) {
			System.out.println("kym2객체와 kym3객체는 참조가 같습니다.");
			System.out.println("kym2" + kym2 + "kym3" + kym3);
		}
		kym2 = new Ex01_Student();//사용할준비가 완료(어딘가를 참조하기 시작함)
		kym3 = new Ex01_Student();//사용할준비가 완료(어딘가를 참조하기 시작함)
		//String str = new String("");
		//str.length();
		if(kym2 == kym3) {
			System.out.println("참조가 같습니다.");
			System.out.println("kym2"+ kym2);
			System.out.println("kym3"+ kym3);
		}else {
			System.out.println("참조가 다릅니다.");
			System.out.println("kym2"+ kym2);
			System.out.println("kym3"+ kym3);
		}
	}
}
