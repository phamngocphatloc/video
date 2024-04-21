package payload;

public class ChangePasswordRequest {
	private String passwordOld;
	private String newPassword;
	private String returnPassword;
	
	
	public ChangePasswordRequest() {
	}


	public ChangePasswordRequest(String passwordOld, String newPassword, String returnPassword) {
		this.passwordOld = passwordOld;
		this.newPassword = newPassword;
		this.returnPassword = returnPassword;
	}


	public String getPasswordOld() {
		return passwordOld;
	}


	public void setPasswordOld(String passwordOld) {
		this.passwordOld = passwordOld;
	}


	public String getNewPassword() {
		return newPassword;
	}


	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}


	public String getReturnPassword() {
		return returnPassword;
	}


	public void setReturnPassword(String returnPassword) {
		this.returnPassword = returnPassword;
	}
	
	
	
	
}
