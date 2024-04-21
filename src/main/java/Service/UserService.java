package Service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import model.User;
import payload.ChangePasswordRequest;
import payload.RegisterRequest;

public interface UserService {
	public void register (RegisterRequest RegisterRequest);
	public String login (String username, String password);
	public int selectTotalPageMyFavorite (User user);
	public void updateAccount (User user);
	public void changePassword (ChangePasswordRequest changePasswordRequest, HttpServletRequest req);
	public List<User> selectUserByPage (int page);
	public int getTotalPage ();
	public User selectById (int id);
}
