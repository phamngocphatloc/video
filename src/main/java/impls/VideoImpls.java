package impls;

import java.util.List;

import Dao.AbstractDao;
import Dao.FavoriteDao;
import Dao.VideoDao;
import model.Favorite;
import model.User;
import model.Video;

public class VideoImpls extends AbstractDao<Video> implements VideoDao{

	@Override
	public Video findById(int id) {
		// TODO Auto-generated method stub
		return super.findById(Video.class, id);
	}

	@Override
	public List<Video> findAll() {
		// TODO Auto-generated method stub
		return super.findAll(Video.class, true);
	}

	@Override
	public Video save(Video video) {
		// TODO Auto-generated method stub
		return super.create(video);
	}

	@Override
	public List<Video> findByPage(int page) {
		// TODO Auto-generated method stub
		String sql = "select v from Video v WHERE v.isActive = 1 order by v.videoid desc";
		List<Video> list = super.findMarySize(Video.class, sql,page,8);
		return list;
	}
	
	@Override
	public Video delete(Video entity) {
		// TODO Auto-generated method stub
		 super.delete(entity.getVideoid(),Video.class);
		 return entity;
	}
	
	@Override
	public Video update(Video entity) {
		// TODO Auto-generated method stub
		return super.update(entity);
	}
	
	@Override
	public List<Video> findByTrending() {
		String sql = "select v from Video v WHERE v.isActive = 1 order by v.views desc";
		List<Video> list = super.findMarySize(Video.class, sql,1,5);
		return list;
	}
	
	@Override
	public List<Video> findVideoFavoriteByUser(User user, int PageNumber) {
		String sql = "SELECT v FROM Video v JOIN v.favorites f WHERE f.user.userid = ?0";
		
		List<Video> list = super.findMarySize(Video.class, sql, PageNumber, 8, user.getUserid());
		
		return list;
	}
	
	@Override
	public List<Video> findVideoByNameLike(String name, int PageNumber) {
		// TODO Auto-generated method stub
		String sql = "SELECT v FROM Video v WHERE v.title LIKE ?0";
		System.out.println("search: "+name);
		List<Video> list = super.findMarySize(Video.class, sql, PageNumber, 8, name);
		return list;
	}
	
	@Override
	public List<Video> findVideoByNameLike(String name) {
		// TODO Auto-generated method stub
		System.out.println("search: "+name);
		String sql = "SELECT v FROM Video v WHERE v.title LIKE ?0";
		List<Video> list = super.findMary(Video.class, sql, name);
		return list;
	}

	@Override
	public void DeleteVideo(Video video) {
		FavoriteDao fdao = new FavoriteDaoImpls();
		fdao.deleteVideoId(video.getVideoid());
		fdao.deleteShareByVideoId(video.getVideoid());
		String sql = "delete Video where Video.Videoid = ?0";
		super.Exeute(Video.class, sql, video.getVideoid());
		
	}


	
}