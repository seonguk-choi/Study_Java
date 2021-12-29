

//객체 == class (Test)
//기능 == 메소드 
//시계.class
//시간을 보여준다 == 메소드
public class Test {
	//어떤 새로운 작업을 시작한다. 
	//1.src 오른쪽 클릭-> class파일을 추가.
	//2.class 지역 안에 class의 기능이 구현 될 main이라는 메소드를 추가한다.
	//3.우리는 5장에 가기 전까지 항상 main메소드 안에서만 작업을 할거입니다.
	public static void main(String[] args) {
		//콘솔창에 어떠한 값을 출력해보기.
		//syso + (자동완성 키) ctrl + space
		//소스의 저장 == ctrl + shift + s
		//실행 == ctrl + F11
		System.out.println("콘솔창에 출력" + 6 + 100);
		//소스코드와 아무런 관련이 없다. (단순한 콘솔에 출력)
		//단순한 확인용 syso
		System.out.println("아무값이나 출력");
		System.out.println("아무값이나 출력을 해도 됩니다.");
		
	}
}