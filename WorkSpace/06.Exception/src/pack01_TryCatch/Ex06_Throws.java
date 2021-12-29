package pack01_TryCatch;

public class Ex06_Throws {
	public static void main(String[] args) {
		//예외처리를 해당하는 메소드나 클래스에서 직접하지 않고
		//상위에 넘기는 방법
		try {
			choi();
		}catch (Exception e) {
			System.out.println("main에서 예외를 처리한다.");
		}
		
	}
	
	public static void choi( ) throws Exception {
		int a = 10/0; //무조건 에러발생하는 코드
		
	}
	
}
	