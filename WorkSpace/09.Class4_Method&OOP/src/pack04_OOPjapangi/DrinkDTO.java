package pack04_OOPjapangi;

//음료의 정보들을 관리할수있는 객체 + 
public class DrinkDTO {
//(1 콜라 금액 : 800 수량 8)
	int number ;
	String name ;
	int price;
	int cnt;
	
	public DrinkDTO(int number, String name, int price, int cnt) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
}
