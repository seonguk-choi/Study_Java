package pack05_override_final;

public class SuperSonicAirplane extends Ariplane {
//일반 비행기의 기능을 전부 가지고있고 + 음속으로 날수있는 기능도있는 2세대
//비행기 객체
//1번 모드 : 일반 비행을 합니다.(<=부모클래스에 정의되어있는 기능을 그대로 사용)
//2번 모드 : 음속으로 비행을 합니다.
//(<=부모클래스에 정의 되어있지 않은 기능을 같은 이름으로 그대로 사용)
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	public static final double PIE = 3.14;
	public int flyMode = NORMAL;
	@Override
		public void fly() {
//		switch (flyMode) {
//		case NORMAL:
//			
//			break;
//		case SUPERSONIC:
//			
//			break;
//		}
		
			if(flyMode == NORMAL) {
				super.fly();
			}else if(flyMode == SUPERSONIC) {
				System.out.println("음속으로 비행합니다");
			}else {
				System.out.println("시스템 고장");
			}
		}
//(상수의 네이밍 규칙 : final이라는 키워드가 나온다. 전체 변수의이름을 대문자로 한다)
//다시는 바뀌지 않는 값 ex) pie = 3.14 
//, 주민등록번호 뒷 첫번째자리( 1 , 3남 , 2 , 4)
//개발이 완료 된 SERVER IP 주소
	
}
