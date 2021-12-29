package pack02_OOP;

public class PersonDAO {
	// Data Acssess Object
	// 데이터베이스 접근해서 기능을 수행하는 객체.
	// 데이터베이스에서 데이터를 가져옴(PersonDTO와 매칭이 되는 데이터)
	// 데이터베이스에 데이터를 보냄(PersonDTO와 매칭이 되는 데이터)
	// Parametter 이용

	void display(PersonDTO[] persons) {
		System.out.println("이름\t나이\t키\t몸무게\t성별");
		for (int i = 0; i < persons.length; i++) {
			System.out.print(persons[i].name + "\t");
			System.out.print(persons[i].age + "\t");
			System.out.print(persons[i].height + "\t");
			System.out.print(persons[i].weight + "\t");
			System.out.print(persons[i].gender + "\t");
			System.out.println();
		}

	}

	void displayMan(PersonDTO[] persons) {
		System.out.println("성별이 남자인 person 조회 ");
		System.out.println("이름\t나이\t키\t몸무게\t성별");
		for (int i = 0; i < persons.length; i++) {
			if (persons[i].gender.equals("남")) {
				System.out.print(persons[i].name + "\t");
				System.out.print(persons[i].age + "\t");
				System.out.print(persons[i].height + "\t");
				System.out.print(persons[i].weight + "\t");
				System.out.print(persons[i].gender + "\t");
				System.out.println();
			}
		}

	}

	void displayWoman(PersonDTO[] persons) {
		System.out.println("성별이 남자인 person 조회 ");
		System.out.println("이름\t나이\t키\t몸무게\t성별");
		for (int i = 0; i < persons.length; i++) {
			if (persons[i].gender.equals("여")) {
				System.out.print(persons[i].name + "\t");
				System.out.print(persons[i].age + "\t");
				System.out.print(persons[i].height + "\t");
				System.out.print(persons[i].weight + "\t");
				System.out.print(persons[i].gender + "\t");
				System.out.println();
			}
		}

	}

	void displayKeword(PersonDTO[] persons , String data) {
		System.out.println("이름\t나이\t키\t몸무게\t성별");
		for (int i = 0; i < persons.length; i++) {
			if (persons[i].name.equals(data)) {
				System.out.print(persons[i].name + "\t");
				System.out.print(persons[i].age + "\t");
				System.out.print(persons[i].height + "\t");
				System.out.print(persons[i].weight + "\t");
				System.out.print(persons[i].gender + "\t");
				System.out.println();
			}
		}
	}

	//
	void displayMaxAge(PersonDTO[] persons) {
		int max = 0;
		for(int i = 0 ; i < persons.length; i++) {
			if(max < persons[i].age) {
				max = persons[i].age;
			}
		}
		System.out.println("나이 최대 값 : " +max);
		System.out.println("이름\t나이\t키\t몸무게\t성별");
		for (int i = 0; i < persons.length; i++) {
			if(persons[i].age == max) {
			System.out.print(persons[i].name + "\t");
			System.out.print(persons[i].age + "\t");
			System.out.print(persons[i].height + "\t");
			System.out.print(persons[i].weight + "\t");
			System.out.print(persons[i].gender + "\t");
			System.out.println();
			}
		}
	}

}
