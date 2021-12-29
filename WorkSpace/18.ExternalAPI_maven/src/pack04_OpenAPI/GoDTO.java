package pack04_OpenAPI;

public class GoDTO {
	private String Mutual;
    private String adrr;
    private String tel;
    private int num;
    private String menu;
    
	public GoDTO(String mutual, String adrr, String tel, int num, String menu) {
		super();
		Mutual = mutual;
		this.adrr = adrr;
		this.tel = tel;
		this.num = num;
		this.menu = menu;
	}

	public String getMutual() {
		return Mutual;
	}

	public void setMutual(String mutual) {
		Mutual = mutual;
	}

	public String getAdrr() {
		return adrr;
	}

	public void setAdrr(String adrr) {
		this.adrr = adrr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}
    
}
