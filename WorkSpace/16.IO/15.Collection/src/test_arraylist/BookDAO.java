package test_arraylist;

import java.util.ArrayList;

public class BookDAO {
	void display(ArrayList<BookDTO> list) {
		System.out.println("책의 제목\t출판사\t가격\t수량\t저자");
		for (BookDTO book : list) {
			System.out.println(book.gettitle()+"\t\t"+book.getPublish()+"\t"+book.getPrice()+"\t"+book.getCnt()+"\t"+book.getWriiter());
		}
	}
}
