package pack03_FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05_ImageIO {
	public static void main(String[] args) throws IOException {
		//파일(그림, 음원, 영상) 에서 바이트 단위로 입출력하는 스트림
		//FileInput, FileOutput Stream
		//이미지를 읽어서 출력하는 프로그램 : Copy & Paste //원볼을 복사해서 사본을 만드는 행위
		//경로를 설졍하지 않으면 현재 프로젝트에서 작업이 이루어진다.(사본)
		//경로설정을 할 경우에는 절대경로로 표기
		//"D:\study_Java\IO_FORDER\EX03_file.txt"
		//상대경로 ex)지금위치 16.IO/src/pack03_FileIO
		//..\folder\img.png <- 내 위치가 기준
		//FileInputStream fis = new FileInputStream("‪D:\\study_Java\\IO_FORDER\\Testimg.jpg");
		//File fi = new File("‪D:\\\\study_Java\\\\IO_FORDER\\\\t.jpg");
		File fi = new File("‪D:\\study_Java\\IO_FORDER\\Testimg.jpg");//원본파일
		File fo = new File("‪D:\\study_Java\\IO_FORDER\\Testimg1.jpg");//원본파일
		if(fi.exists()) {
			FileInputStream fis = new FileInputStream(fi);
			//↑ 원본파일을 자바소스로 가져옴
			FileOutputStream fos = new FileOutputStream(fo);
			//↑ 원본파일을 이용해서 복사 될 사본 파일의 경로와 이름을 지정해둔다.
			int data, cnt = 0; //<-픽셀을 읽어오기 위한 변수
			while((data = fis.read()) != -1) {
				cnt++;
				System.out.println(data);
				fos.write(data);//data값을 기준으로 파일에 출력하기 위해서 데이터를 쌓는다.
			}
			fos.flush();
			fos.close();
			fis.close();
			System.out.println("접근 횟수 : " + cnt);
		}	else {
			System.out.println("경로에 접근을 할 수 없습니다.");
		}
	}
}
