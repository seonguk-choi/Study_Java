package pack03_FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex04_BufferedReader {
	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("D:\\study_Java\\IO_FORDER\\EX03_file.txt");
		BufferedReader br = new BufferedReader(reader);
		while(true) {
			String data = br.readLine(); //데이터를 한줄씩 읽어옴.
			if(data == null) {
				break;
			}
			System.out.println(data);
		}
		reader.close();
		File f = new File("D:\\study_Java\\IO_FORDER\\a.txt");
		if(f.exists()) {
			Reader reader1 = new FileReader(f);
			BufferedReader br1 = new BufferedReader(reader1);
			while(true){
				String data = br1.readLine();//데이터를 한줄 씩 읽어옴.
				if(data == null) {
					break;
				}
				System.out.println(data);
			}
			reader.close();
		}else {
			System.out.println("경로를 찾을 수 없습니다.");
		}
	}
}
