package Dao;

import java.util.List;

import model.User;
import model.Video;

public interface VideoDao {
	public Video findById (int id);
	public List<Video> findAll ();
	public Video save (Video video);
	public Video update (Video video);
	public Video delete (Video video);
	public List<Video> findByPage (int page);
	public List<Video> findByTrending ();
	public List<Video> findVideoFavoriteByUser (User user,int PageNumber);
	public List<Video> findVideoByNameLike (String name, int PageNumber);
	public List<Video> findVideoByNameLike (String name);
	public void DeleteVideo(Video video);
}
