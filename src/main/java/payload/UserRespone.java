package payload;

import model.User;

public class UserRespone {
	private int id;
	private String fullName;
	private String email;
	private boolean isActive;
	private boolean isAdmin;
	
	public UserRespone (User u) {
		this.id = u.getUserid();
		this.fullName = u.getFullName();
		this.email = u.getEmail();
		this.isActive = u.isActive();
		this.isAdmin = u.getAdmin();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
}
