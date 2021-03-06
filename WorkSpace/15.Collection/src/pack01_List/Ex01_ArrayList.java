package pack01_List;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {
	public static void main(String[] args) {
		//List
		//E <- Element(요소)
		//List가 가지는 객체의 타입이 무엇인지를 우리가 정의하는 부분
		//E <- String[] DataType무엇인지를 쓰는 부분.
		String[] arr = new String[3];
		List<String> list = new ArrayList<>();
		//arr.length = 10; length는 final
		System.out.println(arr.length);
		System.out.println(list.size());
		list.add("java1"); //list.size -1
		list.add("java2");
		list.add("java3");
		list.add("java4"); 
		list.add("java5"); 
		list.add("java6");
		list.add("java7");
		list.add("java8");
		list.add("java9"); 
		list.add("java10");
		list.add(2, "인텍스를 선택한 데이터");
		list.add(2, "인텍스를 선택한 데이터");
		System.out.println(list.size());
		System.out.println(list.get(0));
		//for문을 이용해서 list에 있는 전체내용을 콘솔에 출력하세요.
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//List에 데이터 추가 방법 add라는 메소드를 이용해서 추가한다.
		//배열을 사용했을 때는 인덱스에 접근해서 해당하는 데이터타입을 초기화
		//시키거나 값을 할당했다. [""] [String] [String]
	}
}
