package Test2;

public class UserDTO {
	private String user_id;
	private String user_pw;
	private String firstname;
	private String lastname;
	
	public UserDTO(String user_id, String user_pw, String firstname, String lastname) {
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}                       