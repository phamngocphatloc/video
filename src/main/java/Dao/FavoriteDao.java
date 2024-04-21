package Dao;

import model.Favorite;
import model.User;
import model.Video;

public interface FavoriteDao {
	public Favorite findFavoriteByVideoAndUser (User u, Video v);
	public void deleteFavorite (int id);
	public void deleteUserId(int id);
	public void deleteVideoId(int id);
	public void deleteShareByVideoId(int id);
}
