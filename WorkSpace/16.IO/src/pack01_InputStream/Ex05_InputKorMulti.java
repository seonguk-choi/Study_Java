package pack01_InputStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05_InputKorMulti {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		int data ;
		while((data = isr.read()) != -1) {
			if(data != 13 && data != 10) {
				System.out.println("입력하신 글자는" + data +"입니다.");
				System.out.println("입력하신 글자를 변환해서" + (char)data +"입니다.");
			}
		}System.out.println("종료합니다.");
	}
}
