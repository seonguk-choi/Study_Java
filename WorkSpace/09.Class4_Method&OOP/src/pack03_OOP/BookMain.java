package pack03_OOP;

import java.util.Scanner;

public class BookMain {
	public static void main(String[] args) {
		//Test. DTO에 데이터를 입력하고 (수동)
		//getter & setter 메소드의 동작 확인.
		//static<-붙어있나 안붙어있나, 붙어있다 O static멤버 
		//X 인스턴스 멤버 ( 클래스가 인스턴스화(객체로 만들어져야지) 접근할수있는 멤버를뜻함)
		//BookDTO dto1 = new BookDTO("title1", 1, "name1", "company");
		//BookDTO dto2 = new BookDTO("title2", 1, "name2", "company");
		//BookDTO dto3 = new BookDTO("title3", 1, "name3", "company");
		BookDTO[] dtos = new BookDTO[3];
		dtos[0] = new BookDTO("title1", 1, "name1", "company");//dto1;
		dtos[1] = new BookDTO("title1", 1, "name2", "company");//dto2;
		dtos[2] = new BookDTO("title1", 1, "name3", "company");//dto3;
		//String[] arr = new String[3];
		//System.out.println(dtos[0].getName()+dtos[0].getPrice());
		//System.out.println(dtos[1].getName()+dtos[1].getPrice());
		//System.out.println(dtos[2].getName()+dtos[2].getPrice());
		//for(int i = 0 ; i<dtos.length; i++) {//0~2
		//	System.out.println(dtos[i].getName()+dtos[i].getPrice());
		//}
		BookDAO dao = new BookDAO();//인스턴스화(인스턴스멤버사용하기위함)
		//dao.displayBookList(dtos);
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 책 제목을 입력해주세요.");
		dao.displayBookList(dtos,sc.nextLine());
	}
	



}
