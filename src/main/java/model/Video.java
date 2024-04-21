package model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import java.util.List;


/**
 * The persistent class for the Video database table.
 * 
 */
@Entity
@NamedQuery(name="Video.findAll", query="SELECT v FROM Video v")
@Table (name = "Video")
public class Video implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Videoid")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int videoid;

	@Column(name="Active")
	private boolean isActive;

	@Column(name="Description")
	private String description;

	@Column(name="Poster")
	private String poster;

	@Column(name="Title")
	private String title;

	@Column(name="Views")
	private int views;
	
	@Column (name = "url")
	private String url;
	//bi-directional many-to-one association to Favorite
	@OneToMany(mappedBy="video", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Favorite> favorites;

	//bi-directional many-to-one association to Share
	@OneToMany(mappedBy="videoshare", cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Share> shares;
	
	@OneToMany (mappedBy = "videocomment")
	private List<Comment> comments;

	public Video() {
	}

	public int getVideoid() {
		return this.videoid;
	}

	public void setVideoid(int videoid) {
		this.videoid = videoid;
	}

	public boolean getActive() {
		return this.isActive;
	}

	public void setActive(boolean active) {
		this.isActive = active;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPoster() {
		return this.poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getViews() {
		return this.views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public List<Favorite> getFavorites() {
		return this.favorites;
	}

	public void setFavorites(List<Favorite> favorites) {
		this.favorites = favorites;
	}

	public Favorite addFavorite(Favorite favorite) {
		getFavorites().add(favorite);
		favorite.setVideo(this);

		return favorite;
	}

	public Favorite removeFavorite(Favorite favorite) {
		getFavorites().remove(favorite);
		favorite.setVideo(null);

		return favorite;
	}

	public List<Share> getShares() {
		return this.shares;
	}

	public void setShares(List<Share> shares) {
		this.shares = shares;
	}

	public Share addShare(Share share) {
		getShares().add(share);
		share.setVideo(this);

		return share;
	}

	public Share removeShare(Share share) {
		getShares().remove(share);
		share.setVideo(null);

		return share;
	}
	
	public List<Comment> getComments() {
		return comments;
	}
	
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isActive() {
		return isActive;
	}

	
}