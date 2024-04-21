package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Favorite database table.
 * 
 */
@Entity
@NamedQuery(name="Favorite.findAll", query="SELECT f FROM Favorite f")
public class Favorite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Favoriteid")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int favoriteid;

	//bi-directional many-to-one association to User
	@ManyToOne ()
	@JoinColumn(name="UserId")
	private User user;

	//bi-directional many-to-one association to Video
	@ManyToOne ()
	@JoinColumn(name="VideoId")
	private Video video;

	public Favorite() {
	}

	public int getFavoriteid() {
		return this.favoriteid;
	}

	public void setFavoriteid(int favoriteid) {
		this.favoriteid = favoriteid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Video getVideo() {
		return this.video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

}