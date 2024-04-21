package payload;

import model.User;

public class RegisterRequest {
	private String fullname;
	private String email;
	private String password;
	private String returnPassword;

	public RegisterRequest() {

	}

	public RegisterRequest(String fullname, String email, String password, String returnPassword) {

		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.returnPassword = returnPassword;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getReturnPassword() {
		return returnPassword;
	}

	public void setReturnPassword(String returnPassword) {
		this.returnPassword = returnPassword;
	}
	
	public User getUser () {
		User user = new User();
		user.setEmail(this.getEmail());
		user.setFullName(this.fullname);
		user.setPassword(this.getPassword());
		user.setActive(true);
		user.setAdmin(false);
		return user;
	}

}
