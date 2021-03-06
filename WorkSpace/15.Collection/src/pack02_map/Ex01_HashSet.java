package pack02_map;

import java.util.HashSet;
import java.util.Set;

public class Ex01_HashSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		//Interface를 implements 받은 객체(Class)들은
		//Interface를 초기화시킬 수 있다.(생성자메소드)
		set.add("java1");//?
		set.add("java2");
		set.add("java3");
		set.add("java4");
		set.add("java5");
		set.add("java6");//참조값이 같다.
		set.add("java6");//참조값이 같다.
		//set.add(new String("java6")); //참조번호가 다르다. size에 포함이 안된다.
		boolean aa = set.add(new String("java6"));
		System.out.println(set.size());
		System.out.println(aa);
		//For Upgrade -> 향상된 For문
		//조건식이 없는 for문
		//반복을 하면서 데이터가 있다면 받을 변수를 지정하고
		//변수를 빼올(항아리) 자료구조를 써주는 형식.
		//for == foreach
		//for( 빼올 테이터로 변수 선언 : 빼올 자료구조(항아리)) { }
		for(String element : set) {
			System.out.println(element);
		}
		set.clear();//set에 있는 내용을 비운다.
		//is <- 메소드 boolean을 return has
		if(set.isEmpty()) {
			System.out.println("비어있습니다.");
		} else {
			System.out.println("안비어있습니다.");
		}
	}
}
