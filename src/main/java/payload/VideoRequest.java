package payload;

import model.Video;

public class VideoRequest {
	private int videoid;
	private boolean isActive;
	private String description;
	private String poster;
	private String title;
	private String url;
	public VideoRequest () {
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Video getCreateVideo () {
		Video video = new Video();
		video.setActive(true);
		video.setDescription(description);
		video.setPoster(poster);
		video.setTitle(title);
		video.setUrl(url);
		video.setViews(0);
		return video;
	}
}
