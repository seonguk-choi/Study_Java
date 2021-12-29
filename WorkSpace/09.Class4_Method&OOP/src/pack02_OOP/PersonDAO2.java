package pack02_OOP;

public class PersonDAO2 {
	//data access object
	//데이터베이서 접근해서 기능을 수행하는 객체
	//데이터베이스에서 데이터를 가져옴(PersonDTO와 매칭이 되는 데이터)
	//데이터베이스에 데이터를 보냄(PersonDTO와 매칭이 되는 데이터)
	//Parametter 이용
	
	void display(PersonDTO2[] persons) {
		System.out.println("이름\t나이\t키\t몸무게\t성별");
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i].name +"\t"+ persons[i].age +"\t"+ persons[i].height +"\t"+ persons[i].weight +"\t"+ persons[i].gender);
		}
		System.out.println();
	}
	void displayMan(PersonDTO2[] persons) {
		System.out.println("성별이 남자");
		System.out.println("이름\t나이\t키\t몸무게\t성별");
		for (int i = 0; i < persons.length; i++) {
			if(persons[i].gender.equals("남"))
			System.out.println(persons[i].name +"\t"+ persons[i].age +"\t"+ persons[i].height +"\t"+ persons[i].weight +"\t"+ persons[i].gender);
		}
		System.out.println();
	}
	void displayWoman(PersonDTO2[] persons) {
		System.out.println("성별이 여자");
		System.out.println("이름\t나이\t키\t몸무게\t성별");
		for (int i = 0; i < persons.length; i++) {
			if(persons[i].gender.equals("여"))
			System.out.println(persons[i].name +"\t"+ persons[i].age +"\t"+ persons[i].height +"\t"+ persons[i].weight +"\t"+ persons[i].gender);
		}
		System.out.println();
	}
	void displayKeyword(PersonDTO2[] persons, String data) {
		System.out.println("이름 검색");
		System.out.println("이름\t나이\t키\t몸무게\t성별");
		for (int i = 0; i < persons.length; i++) {
			if(persons[i].name.equals(data))
				System.out.println(persons[i].name +"\t"+ persons[i].age +"\t"+ persons[i].height +"\t"+ persons[i].weight +"\t"+ persons[i].gender);
		}
		System.out.println();
	}
	void displayMaxage(PersonDTO2[] persons) {
		int max = 0;
		for (int i = 0; i < persons.length; i++) {
			if(max < persons[i].age) {
				max = persons[i].age;
			}
		}
		System.out.println("최대 나이 : " + max);
		System.out.println("이름\t나이\t키\t몸무게\t성별");
		for (int i = 0; i < persons.length; i++) {
			if(persons[i].age == max)
				System.out.println(persons[i].name +"\t"+ persons[i].age +"\t"+ persons[i].height +"\t"+ persons[i].weight +"\t"+ persons[i].gender);
		}
		System.out.println();
	}

}
