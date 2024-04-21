package serrvlet;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.transaction.Transactional;

import org.apache.commons.collections.FastArrayList;

import Dao.FavoriteDao;
import Dao.UserDao;
import Dao.VideoDao;
import Service.UserService;
import Service.UserServiceImpls;
import Service.VideoService;
import Service.VideoServiceImpls;
import Ultils.JavaMail;
import Ultils.TemplateEmail;
import impls.FavoriteDaoImpls;
import impls.UserDaoImpls;
import impls.VideoImpls;
import model.Favorite;
import model.User;
import model.Video;
import payload.RegisterRequest;
import security.Auth;
import security.JwtUltils;

public class tesst {

	public static void main(String[] args) {
		String emailContent = TemplateEmail.GetTemplateRegister("Phát Lộc");
	

	}
}
