package pack01_List;

import java.util.List;
import java.util.Vector;

public class Ex03_Vector {
	public static void main(String[] args) {
		//별로 안중요함
		List<BoardDTO> list = new Vector<>();
		//Vector<BoardDTO> vec = new Vector<>();
		//list.add(e) 데이터 2건 add시키기.
		list.add(new BoardDTO(1, "title1", "content1"));
		list.add(new BoardDTO(2, "title2", "content2"));
		//list.add(Vector<BoardDTO>(1, "title1", "content1"));
		String str = new String("aa");
		for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));			
		}
	}
}
