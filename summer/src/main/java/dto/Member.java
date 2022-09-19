package dto;

public class Member {
	
	private String username;
	private String email;
	private String pw;
	
	public Member() {}

	public Member(String username, String email, String pw) {
		this.username = username;
		this.email = email;
		this.pw = pw;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
}
