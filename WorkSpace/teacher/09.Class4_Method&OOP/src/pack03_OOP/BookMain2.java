package pack03_OOP;

import java.util.Scanner;

public class BookMain2 {
	public static void main(String[] args) {
		BookDTO[] dtos = new BookDTO[10];
		for (int i = 0; i < dtos.length; i++) {
			if(i == dtos.length /2 ) {
				dtos[i] = new BookDTO("center", i+1, "name1", "company");//dto1;
			}else {
				dtos[i] = new BookDTO("center", i+1, "name1", "company");//dto1;
				
			}
			
		}
		BookDAO dao = new BookDAO();//인스턴스화(인스턴스멤버사용하기위함)
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 책 제목을 입력해주세요.");
		dao.displayBookList(dtos,sc.nextLine());
	}
	



}
