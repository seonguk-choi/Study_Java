package test_array;

import java.util.ArrayList;

public class BookMain2 {
	public static void main(String[] args) {
		ArrayList<BookDTO2> list = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			list.add(new BookDTO2("title"+i, "publish"+i, i*1000, i+1, "writter"+i));
			System.out.println(list.get(i));
		}
		
	}
}

