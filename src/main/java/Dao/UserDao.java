package Dao;

import java.util.List;

import model.Favorite;
import model.User;
import model.Video;

public interface UserDao {
	public User findById (int id);
	public List<User> findAll ();
	public User save (User user);
	public User update (User user);
	public User delete (User user);
	public List<User> findByPage (int page);
	public User findByEmail (String email);
	public User findFavoriteByVideoAndUser (User u, Video v);

}
