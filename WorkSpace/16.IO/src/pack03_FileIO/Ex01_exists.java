package pack03_FileIO;

import java.io.File;

public class Ex01_exists {
	public static void main(String[] args) {
		//파일쪽에서 에러가 안나려면(예외처리) 항상 물리적으로 파일이 존재하는지를
		//먼저 체크해야한다.
		//그전에, 경로가 존재하는지의 여부가 중요하다.
		//File 객체를 초기화 하는 식은 String으로 실제 경로를 파라메터로 넘겨서 생성하는 방법.
		//가장많이 사용된다.
		//File f = new File(pathName);
		//pathName = "D:\Study_Java\IO_FODER"; **\는 Escape라서 \\로 사용
		String pathName = "D:\\study_Java\\IO_FORDER";
		File f = new File(pathName);
		if(f.exists()) {//f.exists 파일 있는지 여부 확인 
			System.out.println("경로가 존재합니다. 파일 업로드 시작!");
		} else {
			System.out.println("경로가 존재하지 않습니다.");
		}
	}
}
