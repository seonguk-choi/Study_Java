package pack01_InputStream;

import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex04_InputKor {
	//키보드에서 한글 1글자를 입력받아서 출력해보기
	public static void main(String[] args) {
		//InputStreamReader : 문자 데이터(Uni Code)를 입력받는 스트림
		//InputStream 		: 바이트데이터 : ASCII, 이미지, 영상, 음원 등을 입력받는 스트림
		//InputStream is = System.in;
		//InputStreamReader isr = new InputStreamReader(is);
		//한줄로 만들어보세요.
		InputStreamReader isr = new InputStreamReader(System.in);//바이트를 넘어 더 큰 범위를 받을 수 있다. 단, 한글자씩 받는 건 같다.
		//InputStream in = this.in = in;
		try {
			int data = isr.read();
			System.out.println("입력하신 글자는 " + data + "입니다.");
			System.out.println("입력하신 글자는 변환해서 " + (char)data + "입니다.");
			//12610
			//12623
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
