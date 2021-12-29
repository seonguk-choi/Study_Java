package pack01_InputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ChoiScanner {
	BufferedReader br;

	public ChoiScanner(InputStream in) {
		this.br = new BufferedReader(new InputStreamReader(in));
	}

	public String nextline() {

		try {
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
	
}
