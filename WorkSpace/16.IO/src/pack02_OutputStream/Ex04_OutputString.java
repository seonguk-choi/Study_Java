package pack02_OutputStream;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex04_OutputString {
	public static void main(String[] args) throws IOException {
		//InputStream -> InputStreamReader -> BufferedReader(속도가 가장빠름)
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		String str = "문자열을 입력\n 줄바꿈";
		osw.write(str);;
		osw.flush();
	}
}
