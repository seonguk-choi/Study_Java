package pack01_TryCatch;

public class Ex04_TryCatchOrder {
	public static void main(String[] args) {
		try {
			int a =10/0;
			int[] arr = new int[3];
			arr[6] = 0; //예외처리 필요함.
		} catch (ArrayIndexOutOfBoundsException e) {
			//배열에 인텍스 오류가 발생했을때 처리코드
			System.out.println("인텍스 오류남");
		} catch (Exception e) {// Exception e :예외가 났을때 오류정보 갖고 있는 상수
			//그 외에 오류가 발생했을때 처리코드 
			e.printStackTrace();
			//예외를 상세하게 출력(예외처리를 하지 않았을때 코드확인)
			System.out.println("그외에 오류");
		}
	}
}
