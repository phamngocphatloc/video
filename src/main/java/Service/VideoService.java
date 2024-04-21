package Service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import model.User;
import model.Video;
import payload.VideoRequest;

public interface VideoService {
	public List<Video> SelectTrending ();
	public List<Video> selectByPage (int page);
	public void SeenVideo (Video video);
	public void updateVideo (Video video);
	public void likeVideo (User user, Video video);
	public void UnlikeVideo(User user, Video video);
	public Video selectVideoById (int id);
	public int getTotalPage ();
	public List<Video> selectByPageandUserFavorite (int page,User user);
	public List<Video> searchByName (int page, String name);
	public int selectTotalPageSearch (String name);
	public void ShareVideo (User user, Video video, String email, HttpServletRequest rq);
	public void AddVideo (VideoRequest vd);
	public void deleteVideo (Video video);
}
