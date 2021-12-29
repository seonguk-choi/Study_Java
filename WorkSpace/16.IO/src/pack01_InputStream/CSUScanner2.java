package pack01_InputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class CSUScanner2 {
		//BufferReader를 이용해서 유저스캐너를 만들다.(목적)
		//Scanner sc = new Scanner(System.in); 초기화를 똑같이 할 수 있게 만든다.
		//1.자신의 이름 + Scanner.java(class)
		//InputStreamReader isr)
		//(BufferReader br)
		//2.ScannerMain에서 UserScanner를 이용해서 콘솔 출력해보기.
		//Main 코드는 아래보다 많으면 안됨.
		//KymScanner ks = new KymScanner();
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		public void CSUScanner() throws IOException {
			System.out.println("이름을 입력하세요.");
		}
		public BufferedReader getBr() {
			return br;
		}

		public void setBr() throws IOException {
			br.readLine();
		}

}
