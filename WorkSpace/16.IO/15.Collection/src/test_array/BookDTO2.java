package test_array;

public class BookDTO2 {
	private String title;
	private String publish;
	private int price;
	private int cnt;
	private String writter;
	public BookDTO2(String title, String publish, int price, int cnt, String writter) {
		super();
		this.title = title;
		this.publish = publish;
		this.price = price;
		this.cnt = cnt;
		this.writter = writter;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
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
	public String getWritter() {
		return writter;
	}
	public void setWritter(String writter) {
		this.writter = writter;
	}
	
}
