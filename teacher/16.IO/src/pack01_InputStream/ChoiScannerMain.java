package pack01_InputStream;

import java.io.InputStreamReader;

public class ChoiScannerMain {
	public static void main(String[] args) {
		ChoiScanner choi = new ChoiScanner(System.in);
		System.out.println(choi.nextline());
	}
}
