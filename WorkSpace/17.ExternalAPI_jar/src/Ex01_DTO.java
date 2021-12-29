
public class Ex01_DTO {
//data transfer object, DTO
//Database에서 가져온 데이터들은 각 속성이 다르아.
//이 데이터들을 하나로 묶는 용도로 가장 많이 사용한다.
//Database Table Columns == DTO Field 또는 + 더 많음 (SUM,
	//DTO 만들때 1. SqlDev -> 데이블 더블 클릭 -> 컬럼 복사
	//DTO.class에 붙여넣기
	//2.소문자 바꾸기 ctrl +shift +y
	//3-1.블록모드 또는 직접 수기로 데이터타입 주기
	//3-2.블록모드 alt + shift + a 
	private int num;	
	private String name;
	private int age;	
	private String addr;
	private String tel;
	
	//처음 생성할 때 데이터를 세팅할 것인지(Field, Constroctor)
	//그냥 객체를 생성하고 나서 메소드를 이용해서 세팅할 것인지(getter & setter)
	//Field에 바로 접근해서 데이터 세팅하기. <-사용 안할 것을 권장, field에 private 꼭 붙이기
	
	public Ex01_DTO(int num, String name, int age, String addr, String tel) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.tel = tel;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
