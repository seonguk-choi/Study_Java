package pack02_OOP;

import java.util.Arrays;

public class PersonMain2 {
	public static void main(String[] args) {
		PersonDTO2[] persons = new PersonDTO2[5];
		//persons라는 *배열 (요소로 PersonDTO를 가지는)
		//을 0번부터 배열의 끝 인텍스까지 모두 인스턴스화 시키고 값을 출력을 1건만 해보세요.
		//PersonDTO person = new PersonDTO();
		//PersonDTO2 dto1 = new PersonDTO2("홍길도", 30, 170, 70, "남");
		persons[0] = new PersonDTO2("홍길동", 14, 170, 70, "남");
		persons[1] = new PersonDTO2("춘향", 13, 171, 70, "여");
		persons[2] = new PersonDTO2("길동", 14, 172, 70, "남");
		persons[3] = new PersonDTO2("춘향이", 16, 173, 70, "여");
		persons[4] = new PersonDTO2("홍길동춘", 17, 174, 70, "남");
		System.out.println(Arrays.toString(persons));
		//메소드 호출하기
		//PersonDAO display();
		PersonDAO2 dao = new PersonDAO2();
		//dao의 인스턴스화
		dao.display(persons);
		dao.displayMan(persons);
		dao.displayWoman(persons);
		dao.displayKeyword(persons, "춘향");
		dao.displayMaxage(persons);
	}
}
