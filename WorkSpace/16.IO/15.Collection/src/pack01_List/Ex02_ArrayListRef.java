package pack01_List;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex02_ArrayListRef {
	public static void main(String[] args) {
		BoardDTO dto = new BoardDTO(1, "litle1", "content1");
		//BoardDTO[] barray = new BoardDTO[3];
		//System.out.println(Arrays.toString(barray));
		//barray[0] = new BoardDTO(1, "title1", "content1");
		//barray[1] = new BoardDTO(2, "title2", "content2");
		//barray[2] = new BoardDTO(3, "title3", "content3");
		//System.out.println(Arrays.toString(barray));
		ArrayList<BoardDTO> list =  new ArrayList<>();
		list.add(new BoardDTO(1, "title1", "content1"));
		list.add(new BoardDTO(2, "title2", "content2"));
		list.add(new BoardDTO(3, "title3", "content3"));
		list.add(new BoardDTO(4, "title4", "content4"));
		list.add(new BoardDTO(5, "title5", "content5"));
		list.add(new BoardDTO(6, "title6", "content6"));
		list.add(new BoardDTO(7, "title7", "content7"));
		list.add(new BoardDTO(8, "title8", "content8"));
		list.add(new BoardDTO(9, "title9", "content9"));
		list.add(new BoardDTO(10, "title10", "content10"));
		//list.add(null);
		for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getTitle());
				System.out.println(list.get(i).getTitle());
		}
	}
}
