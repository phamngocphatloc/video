package impls;

import java.util.List;

import Dao.AbstractDao;
import Dao.UserDao;
import model.Favorite;
import model.User;
import model.Video;

public class UserDaoImpls extends AbstractDao<User> implements UserDao {

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return super.findById(User.class, id);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return super.findAll(User.class, true);
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return super.create(user);
	}

	@Override
	public List<User> findByPage(int page) {
		// TODO Auto-generated method stub
		return super.findUserAll(User.class, true, page, 8);
	}
	
	@Override
	public User update(User entity) {
		// TODO Auto-generated method stub
		return super.update(entity);
	}
	
	@Override
	public User delete(User entity) {
		// TODO Auto-generated method stub
		 super.delete(entity.getUserid(),User.class);
		 return entity;
	}
	
	@Override
	public User findByEmail(String email) {;
		// TODO Auto-generated method stub
		String jpql = "SELECT u FROM User u where u.email = ?0";
		return super.findOne(User.class, jpql, email);
	}
	
	@Override
	public User findFavoriteByVideoAndUser(User u, Video v) {
		// TODO Auto-generated method stub
		String sql = "SELECT u \r\n"
				+ "FROM User u\r\n"
				+ "JOIN u.favorites f\r\n"
				+ "WHERE u.id = ?0 AND f.videoId = ?1";
		return super.findOne(User.class, sql, u.getUserid(),v.getVideoid());
	}
}
