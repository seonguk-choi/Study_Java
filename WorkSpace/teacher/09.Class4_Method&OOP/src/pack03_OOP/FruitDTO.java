package pack03_OOP;

public class FruitDTO {
	//과일의 이름 , 가격 , 수량 , 원산지
	String name ;//이름
	int price;//가격
	int cnt;//수량
	String org;//원산지
	public FruitDTO(String name, int price, int cnt, String org) {
		super();
		this.name = name;
		this.price = price;
		this.cnt = cnt;
		this.org = org;
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
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	
	
	
	
}
