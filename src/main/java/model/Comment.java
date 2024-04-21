package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "comment")
public class Comment {
	@Id
	private int id;
	@Column (name = "rate")
	private int rate;
	
	@ManyToOne 
	@JoinColumn (name = "UserId")
	private User userComment;
	
	@ManyToOne
	@JoinColumn (name = "VideoId")
	private Video videocomment;
	
	public Comment () {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public User getUserComment() {
		return userComment;
	}

	public void setUserComment(User userComment) {
		this.userComment = userComment;
	}

	public Video getVideo() {
		return videocomment;
	}

	public void setVideo(Video video) {
		this.videocomment = video;
	}
	
	
}
