package impls;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import Dao.AbstractDao;
import Dao.FavoriteDao;
import Ultils.JpaUtils;
import model.Favorite;
import model.User;
import model.Video;

public class FavoriteDaoImpls extends AbstractDao<Favorite> implements FavoriteDao {

	@Override
	public Favorite findFavoriteByVideoAndUser(User u, Video v) {
		String sql = "SELECT f FROM Favorite f WHERE f.user.id = ?0 AND f.video.id = ?1";
		return super.findOne(Favorite.class, sql, u.getUserid(),v.getVideoid());
	}
	
	@Override
	public void deleteFavorite(int id) {
		String sql = "delete Favorite where Favorite.UserId = ?0";
		super.Exeute(Favorite.class, sql, id);
	}
	
	@Override
	public void deleteUserId(int id) {
		String sql = "delete Favorite where Favoriteid = ?0";
		super.Exeute(Favorite.class, sql, id);
	}
	@Override
	public void deleteVideoId(int id) {
		String sql = "delete Favorite where Favorite.VideoId = ?0";
		super.Exeute(Favorite.class, sql, id);
	}

	@Override
	public void deleteShareByVideoId(int id) {
		String sql = "delete Share where Share.VideoId = ?0";
		super.Exeute(Favorite.class, sql, id);
		
	}
	

}
