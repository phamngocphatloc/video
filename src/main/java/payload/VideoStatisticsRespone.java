package payload;

import java.util.ArrayList;
import java.util.List;

import model.Video;

public class VideoStatisticsRespone {
	private int videoId;
	private String title;
	private int totalLike;
	private int totalShare;
	private String poster;
	private int views;
	private List<UserRespone> listUserFavorite = new ArrayList<UserRespone>();
	private List<ShareRespone> listShare = new ArrayList<ShareRespone>();
	public VideoStatisticsRespone(Video video) {
		this.videoId = video.getVideoid();
		this.title = video.getTitle();
		this.totalLike = video.getFavorites().size();
		this.totalShare = video.getShares().size();
		this.poster = video.getPoster();
		this.views = video.getViews();
		video.getFavorites().stream().forEach(item -> {
			this.listUserFavorite.add(new UserRespone(item.getUser()));
		});;
		
		video.getShares().stream().forEach(item -> {
			this.listShare.add(new ShareRespone(item));
		});
		

	}
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getTotalLike() {
		return totalLike;
	}
	public void setTotalLike(int totalLike) {
		this.totalLike = totalLike;
	}
	public int getTotalShare() {
		return totalShare;
	}
	public void setTotalShare(int totalShare) {
		this.totalShare = totalShare;
	}
	public List<UserRespone> getListUserFavorite() {
		return listUserFavorite;
	}
	public void setListUserFavorite(List<UserRespone> listUserFavorite) {
		this.listUserFavorite = listUserFavorite;
	}
	public List<ShareRespone> getListShare() {
		return listShare;
	}
	public void setListShare(List<ShareRespone> listShare) {
		this.listShare = listShare;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	
	

}
