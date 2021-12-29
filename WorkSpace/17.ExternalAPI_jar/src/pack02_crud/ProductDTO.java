package pack02_crud;

public class ProductDTO { 
	private int num;
	private String name; 
	private String company; 
	private int price;
	private int qty;
	public ProductDTO(int num, String name, String company, int price, int qty) {
		super();
		this.num = num;
		this.name = name;
		this.company = company;
		this.price = price;
		this.qty = qty;
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
}                         