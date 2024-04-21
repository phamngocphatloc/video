package payload;

import model.Video;

public class VideoRespone {
	private int videoid;
	private boolean isActive;
	private String description;
	private String poster;
	private String title;
	private int views;
	private String url;
	public VideoRespone (Video vd) {
		this.videoid = vd.getVideoid();
		this.isActive = vd.getActive();
		this.description = vd.getDescription();
		this.poster = vd.getPoster();
		this.title = vd.getTitle();
		this.views = vd.getViews();
		this.url = vd.getUrl();
	}
	public int getVideoid() {
		return videoid;
	}
	public void setVideoid(int videoid) {
		this.videoid = videoid;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
