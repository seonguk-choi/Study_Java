package pack03_FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02_FileTxt {
	public static void main(String[] args) throws IOException {
		//InputStream, OutputStream
		Reader reader = new FileReader("D:\\study_Java\\IO_FORDER\\EX02_file.txt");
		String str = ""; //txt읽어온거 넣을 변수
		char[] buffer = new char[5];
		int readCharNum = reader.read(buffer);
		if(readCharNum != -1) {
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		reader.close();
	}
}
