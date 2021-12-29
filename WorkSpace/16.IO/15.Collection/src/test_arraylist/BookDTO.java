package test_arraylist;

public class BookDTO {
	private String title;
	private String publish;
	private int price;
	private int cnt;
	private String wriiter;
	public BookDTO(String title, String publish, int price, int cnt, String wriiter) {
		super();
		this.title = title;
		this.publish = publish;
		this.price = price;
		this.cnt = cnt;
		this.wriiter = wriiter;
	}
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
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
	public String getWriiter() {
		return wriiter;
	}
	public void setWriiter(String wriiter) {
		this.wriiter = wriiter;
	}
	
}
