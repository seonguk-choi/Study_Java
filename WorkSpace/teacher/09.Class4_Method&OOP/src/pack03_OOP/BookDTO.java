package pack03_OOP;

public class BookDTO {
	//제목 , 가격 , 저자 , 출판사
	//"해리포터" String
	//20000 int , double 숫자값
	//"롤링" String
	//"모름" String
	String title ;
	int price;
	String name;
	String company;
	//BookDTO dto = new BookDTO() == X;
	public BookDTO(String title, int price, String name, String company) {
		super();
		this.title = title;
		this.price = price;
		this.name = name;
		this.company = company;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	
}
