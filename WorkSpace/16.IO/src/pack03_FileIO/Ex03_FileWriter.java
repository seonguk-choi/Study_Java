package pack03_FileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex03_FileWriter {
	public static void main(String[] args) throws IOException {
		//자바소스 -> 경로에 실제 있는 파일로 쓰기
		Writer writer = new FileWriter("D:\\study_Java\\IO_FORDER\\EX03_file.txt"); //실제로 없는 파일
		String str = "ABC";
		writer.write(str);
     	writer.write(str+"\n");
		writer.write(str);
		writer.write(str);
		writer.write(str);
		writer.write(str);
		writer.write(str);
		writer.write(str+"\n");
//		writer.flush();//버퍼에 담아진 모든 내용을 텍스트파일에 강제로 쓴다.
//		writer.close();
		//Ex03_FileGugu
		//for문을 이용해서 구구단을 텍스트파일에 저장해보세요.
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				int gugu = i*j;
				writer.write(i+" X "+j+" = " +gugu +" / ");
			}
			writer.write("\n");
		}
		for (int i = 0; i <= 10; i++) {
			if(i<6) {
				for (int j = 0; j < 6; j++) {
					if(i>=j) {
						writer.write("★");
					}
				}
			} else if(i>=6) {
				for (int k = 10; k > 5 ; k--) {
					if (i<=k) {
						writer.write("★");
					}	
				}
			}
			writer.write("\n");
		    }
		writer.flush();
		writer.close();
	}
}

