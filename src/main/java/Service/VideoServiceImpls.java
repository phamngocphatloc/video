package Service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import Dao.FavoriteDao;
import Dao.UserDao;
import Dao.VideoDao;
import Ultils.JavaMail;
import Ultils.JpaUtils;
import Ultils.TemplateEmail;
import impls.FavoriteDaoImpls;
import impls.UserDaoImpls;
import impls.VideoImpls;
import model.Favorite;
import model.Share;
import model.User;
import model.Video;
import payload.VideoRequest;
import security.Auth;

public class VideoServiceImpls implements VideoService{
	
	VideoDao videodao;
	FavoriteDao favoriteDao;
	UserDao userdao;
	public VideoServiceImpls () {
		videodao = new VideoImpls();
		favoriteDao = new FavoriteDaoImpls();
		userdao = new UserDaoImpls();
	}

	@Override
	public List<Video> SelectTrending() {
		// TODO Auto-generated method stub
		return videodao.findByTrending();
	}

	@Override
	public List<Video> selectByPage(int page) {
		// TODO Auto-generated method stub
		return videodao.findByPage(page);
	}

	@Override
	public void SeenVideo(Video video) {
		video.setViews(video.getViews()+1);
		videodao.update(video);
		
	}

	@Override
	public void updateVideo(Video video) {
		// TODO Auto-generated method stub
		if (!video.getTitle().equalsIgnoreCase("") && 
				!video.getPoster().equalsIgnoreCase("") &&
				!video.getUrl().equalsIgnoreCase("")) {
		videodao.update(video);
		}else {
			throw new IllegalArgumentException("vui lòng nhập đủ thông tin");
		}
		
	}
	
	@Override
	public void likeVideo(User user, Video video) {
		if (favoriteDao.findFavoriteByVideoAndUser(user, video)==null) {
			Favorite fav = new Favorite();
			fav.setUser(user);
			fav.setVideo(video);
			List<Favorite> listf;
			if (!video.getFavorites().isEmpty()) {
				listf = video.getFavorites();
			}else {
				listf = new ArrayList<Favorite>();
			}
			listf.add(fav);
			video.setFavorites(listf);
			this.updateVideo(video);
		}else {
			throw new IllegalArgumentException("Bạn Đã Like Rồi");
		}
		
	}

	@Override
	public void UnlikeVideo(User user, Video video) {
		// TODO Auto-generated method stub
		if (favoriteDao.findFavoriteByVideoAndUser(user, video)!=null) {
			Favorite favorite = favoriteDao.findFavoriteByVideoAndUser(user, video);
			favoriteDao.deleteFavorite(favorite.getFavoriteid());
		}else {
			throw new IllegalArgumentException("Bạn Chưa Like Video Này");
		}
	}
	
	
	@Override
	public Video selectVideoById(int id) {
		// TODO Auto-generated method stub
		return videodao.findById(id);
	}
	
	@Override
	public int getTotalPage() {
		int totalPage = (int) Math.ceil(videodao.findAll().size()/8.0);
		return totalPage;
	}
		
	@Override
	public List<Video> selectByPageandUserFavorite(int page, User user) {
		// TODO Auto-generated method stub
		return videodao.findVideoFavoriteByUser(user, page);
	}
	
	@Override
	public List<Video> searchByName(int page, String name) {
		// TODO Auto-generated method stub
		name = "%"+ name + "%";
		return videodao.findVideoByNameLike(name, page);
	}
	
	@Override
	public int selectTotalPageSearch(String name) {
		name = "%"+ name + "%";
		int totalPage = (int) Math.ceil(videodao.findVideoByNameLike(name).size()/8.0);
		return totalPage;
	}

	@Override
	public void ShareVideo(User user, Video video, String email, HttpServletRequest rq) {
		if (Auth.isLogin(rq)!=null) {
			Share share = new Share();
			share.setUser(user);
			share.setVideo(video);
			share.setEmail(email);
			share.setDate();
			List<Share> lists;
			if (!video.getShares().isEmpty()) {
				lists = video.getShares();
			}else {
				lists = new ArrayList<Share>();
			}
			lists.add(share);
			video.setShares(lists);
			this.updateVideo(video);
			String emailContent = TemplateEmail.getMailShare(user.getFullName(), email, "http://localhost:8080/asm2/watch/"+video.getVideoid());
			JavaMail.sendmail(email, emailContent, "Chia Sẽ Video Cho Bạn");
		}else {
			throw new IllegalArgumentException("Vui Lòng Đăng Nhập Trước Khi Share");
		}
		
	}

	@Override
	public void AddVideo(VideoRequest vd) {
		if (!vd.getTitle().equalsIgnoreCase("") && 
				!vd.getPoster().equalsIgnoreCase("") &&
				!vd.getUrl().equalsIgnoreCase("")) {
		videodao.save(vd.getCreateVideo());
		}else {
			throw new IllegalArgumentException("vui lòng nhập đủ thông tin");
		}
	}

	@Override
	public void deleteVideo(Video video) {
		videodao.DeleteVideo(video);
		
	}
	
	
	
}
