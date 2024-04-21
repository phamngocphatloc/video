package model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;


/**
 * The persistent class for the Share database table.
 * 
 */
@Entity
@NamedQuery(name="Share.findAll", query="SELECT s FROM Share s")
public class Share implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ShareId")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int shareId;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="UserId")
	private User user;

	//bi-directional many-to-one association to Video
	@ManyToOne
	@JoinColumn(name="VideoId")
	private Video videoshare;
	
	@Column (name = "Email")
	private String email;
	
	@Column (name = "LikeDate")
	private Date date;
	
	public Share() {
	}

	public int getShareId() {
		return this.shareId;
	}

	public void setShareId(int shareId) {
		this.shareId = shareId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Video getVideo() {
		return this.videoshare;
	}

	public void setVideo(Video video) {
		this.videoshare = video;
	}

	public Date getDate() {
		return date;
	}
	
	public void setDate() {
		java.util.Date currentDate = new java.util.Date();

        // Chuyển đổi ngày hiện tại thành java.sql.Date
        java.sql.Date sqlDate = new java.sql.Date(currentDate.getTime());
		this.date = sqlDate;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
}