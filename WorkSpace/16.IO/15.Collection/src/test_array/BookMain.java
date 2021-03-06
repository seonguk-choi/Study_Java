package test_array;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
	public static void main(String[] args) {
		//List<int> listTitle = new ArrayList<>();
		//참조타입의 테이터를 넣지 않아서(요소) 에러↑
		ArrayList<BookDTO> list =  new ArrayList<>();
		list.add(new BookDTO("가", "가", 1000, 1, "가"));
		list.add(new BookDTO("나", "나", 2000, 2, "나"));
		list.add(new BookDTO("다", "다", 3000, 3, "다"));
		list.add(new BookDTO("라", "라", 4000, 4, "라"));
		list.add(new BookDTO("마", "마", 5000, 5, "마"));
		System.out.println("책의 제목\t출판사\t가격\t수량\t저자");
		for (BookDTO book : list) {
			System.out.println(book.gettitle()+"\t\t"+book.getPublish()+"\t"+book.getPrice()+"\t"+book.getCnt()+"\t"+book.getWriiter());
		}
		BookDAO dao = new BookDAO();
		dao.display(list);
	}
}
