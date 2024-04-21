package payload;

import java.sql.Date;

import model.Share;

public class ShareRespone {
	private int ShareId;
	private String userSend;
	private String email;
	private Date date;
	public ShareRespone(Share share) {
		// TODO Auto-generated constructor stub
		this.ShareId = share.getShareId();
		this.userSend = share.getUser().getEmail();
		this.email = share.getEmail();
		this.date = share.getDate();
	}
	public int getShareId() {
		return ShareId;
	}
	public void setShareId(int shareId) {
		ShareId = shareId;
	}
	public String getUserSend() {
		return userSend;
	}
	public void setUserSend(String userSend) {
		this.userSend = userSend;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
