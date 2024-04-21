package Ultils;

public class TemplateEmail {
	public static String GetTemplateRegister(String fullname) {
		String emailContent = "<!DOCTYPE html>" + "<html lang='en'>" + "<head>" + "<meta charset='UTF-8'>"
				+ "<meta name='viewport' content='width=device-width, initial-scale=1.0'>"
				+ "<title>Chào mừng bạn đến với PL TUBE!</title>" + "<style>" + "/* Thiết lập font chữ */"
				+ "@import url('https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap');"
				+ "/* Thiết lập cơ bản */" + "body {" + "    font-family: 'Roboto', sans-serif;" + "    margin: 0;"
				+ "    padding: 0;" + "    background-color: #f4f4f4;" + "}" + "/* Thiết lập header */" + ".header {"
				+ "    background-color: #FFA500;" // Màu cam vàng
				+ "    padding: 20px;" + "    color: #ffffff;" + "    text-align: center;" + "}"
				+ "/* Thiết lập nội dung */" + ".content {" + "    padding: 40px;" + "}" + "/* Thiết lập tiêu đề */"
				+ "h1 {" + "    color: #303F9F;" + "    text-align: center;" + "    margin-bottom: 20px;" + "}"
				+ "/* Thiết lập đoạn văn */" + "p {" + "    color: #333333;" + "    line-height: 1.6;"
				+ "    margin-bottom: 20px;" + "}" + "/* Thiết lập chân trang */" + ".footer {"
				+ "    background-color: #FFA500;" // Màu cam vàng
				+ "    color: #ffffff;" + "    padding: 20px;" + "    text-align: center;" + "}" + "</style>"
				+ "</head>" + "<body>" + "<div class='header'>" + "<h1>Chào mừng bạn đến với PL TUBE!</h1>" + "</div>"
				+ "<div class='content'>" + "<p>Xin chào [ " + fullname + " ],</p>"
				+ "<p>Chúc mừng bạn đã đăng ký thành công với PLTUBE! Chúng tôi rất vui mừng khi chào đón bạn vào cộng đồng của chúng tôi.</p>"
				+ "<p>Nếu bạn có bất kỳ câu hỏi hoặc đề xuất nào, đừng ngần ngại liên hệ với chúng tôi qua email hoặc diễn đàn cộng đồng. Chúng tôi luôn sẵn lòng hỗ trợ bạn.</p>"
				+ "<p>Một lần nữa, chúng tôi chân thành cảm ơn bạn đã tham gia với PLTUBE. Hy vọng chúng tôi có thể giúp cho bạn một cách tốt nhất.</p>"
				+ "</div>" + "<div class='footer'>" + "<p>Trân trọng,</p>" + "<p>PL TUBE</p>" + "</div>" + "</body>"
				+ "</html>";
		return emailContent;
	}

	public static String getEmailForgetPass(String link) {
		String emailContent = "<!DOCTYPE html>" + "<html lang='en'>" + "<head>" + "<meta charset='UTF-8'>"
				+ "<meta name='viewport' content='width=device-width, initial-scale=1.0'>"
				+ "<title>Quên mật khẩu - PL TUBE</title>" + "<style>" + "/* Thiết lập font chữ */"
				+ "@import url('https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap');"
				+ "/* Thiết lập cơ bản */" + "body {" + "    font-family: 'Roboto', sans-serif;" + "    margin: 0;"
				+ "    padding: 0;" + "    background-color: #f4f4f4;" + "}" + "/* Thiết lập header */" + ".header {"
				+ "    background-color: #FFA500;" // Màu cam vàng
				+ "    padding: 20px;" + "    color: #ffffff;" + "    text-align: center;" + "}"
				+ "/* Thiết lập nội dung */" + ".content {" + "    padding: 40px;" + "}" + "/* Thiết lập button */"
				+ ".button {" + "    display: inline-block;" + "    background-color: #FFA500;" // Màu cam vàng
				+ "    color: #ffffff;" + "    text-decoration: none;" + "    padding: 10px 20px;"
				+ "    border-radius: 5px;" + "    margin-top: 20px;" + "    text-align: center;" + "}"
				+ ".button:hover {" + "    background-color: #ffa042;" // Màu cam vàng nhạt khi hover
				+ "}" + "/* Thiết lập chân trang */" + ".footer {" + "    background-color: #FFA500;" // Màu cam vàng
				+ "    color: #ffffff;" + "    padding: 20px;" + "    text-align: center;" + "}" + "</style>"
				+ "</head>" + "<body>" + "<div class='header'>" + "<h1>Quên mật khẩu - PL TUBE</h1>" + "</div>"
				+ "<div class='content'>" + "<p>Xin chào,</p>"
				+ "<p>Bạn đã yêu cầu lấy lại mật khẩu cho tài khoản PL TUBE của mình.</p>"
				+ "<p>Vui lòng nhấn vào nút bên dưới để thiết lập lại mật khẩu của bạn:</p>" + "<a href='" + link
				+ "' class='button'>Thiết lập lại mật khẩu</a>"
				+ "<p>Nếu bạn không thực hiện yêu cầu này, bạn có thể bỏ qua email này.</p>" + "</div>"
				+ "<div class='footer'>" + "<p>Trân trọng,</p>" + "<p>PL TUBE</p>" + "</div>" + "</body>" + "</html>";
		return emailContent;
	}
	
	public static String getEmailForgetPassSuccess(String password) {
		String emailContent = "<!DOCTYPE html>"
                + "<html lang='en'>"
                + "<head>"
                + "<meta charset='UTF-8'>"
                + "<meta name='viewport' content='width=device-width, initial-scale=1.0'>"
                + "<title>Mật khẩu mới - PL TUBE</title>"
                + "<style>"
                + "/* Thiết lập font chữ */"
                + "@import url('https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap');"
                + "/* Thiết lập cơ bản */"
                + "body {"
                + "    font-family: 'Roboto', sans-serif;"
                + "    margin: 0;"
                + "    padding: 0;"
                + "    background-color: #f4f4f4;"
                + "}"
                + "/* Thiết lập header */"
                + ".header {"
                + "    background-color: #303F9F;"
                + "    padding: 20px;"
                + "    color: #ffffff;"
                + "    text-align: center;"
                + "}"
                + "/* Thiết lập nội dung */"
                + ".content {"
                + "    padding: 40px;"
                + "}"
                + "/* Thiết lập tiêu đề */"
                + "h1 {"
                + "    color: #303F9F;"
                + "    text-align: center;"
                + "    margin-bottom: 20px;"
                + "}"
                + "/* Thiết lập đoạn văn */"
                + "p {"
                + "    color: #333333;"
                + "    line-height: 1.6;"
                + "    margin-bottom: 20px;"
                + "}"
                + "/* Thiết lập chân trang */"
                + ".footer {"
                + "    background-color: #303F9F;"
                + "    color: #ffffff;"
                + "    padding: 20px;"
                + "    text-align: center;"
                + "}"
                + "</style>"
                + "</head>"
                + "<body>"
                + "<div class='header'>"
                + "<h1>Mật khẩu mới - PL TUBE</h1>"
                + "</div>"
                + "<div class='content'>"
                + "<p>Xin chào,</p>"
                + "<p>Dưới đây là mật khẩu mới cho tài khoản PL TUBE của bạn:</p>"
                + "<h2>" + password + "</h2>"
                + "<p>Vui lòng đăng nhập và thay đổi mật khẩu sau khi đăng nhập thành công.</p>"
                + "<p>Nếu bạn không thực hiện yêu cầu này, vui lòng liên hệ với chúng tôi ngay lập tức.</p>"
                + "</div>"
                + "<div class='footer'>"
                + "<p>Trân trọng,</p>"
                + "<p>PL TUBE</p>"
                + "</div>"
                + "</body>"
                + "</html>";
		return emailContent;
	}
	
	public static String getMailShare (String fullName, String email , String link) {
		String emailContent = "<!DOCTYPE html>"
                + "<html lang='en'>"
                + "<head>"
                + "<meta charset='UTF-8'>"
                + "<meta name='viewport' content='width=device-width, initial-scale=1.0'>"
                + "<title>Chia sẻ video - PL TUBE</title>"
                + "<style>"
                + "/* Copy style from above HTML */"
                + "</style>"
                + "</head>"
                + "<body>"
                + "<div class='header'>"
                + "<h1>Chia sẻ video - PL TUBE</h1>"
                + "</div>"
                + "<div class='content'>"
                + "<p>Xin chào: "+email+" ,</p>"
                + "<p>Tôi Là: "+fullName+" Tôi muốn chia sẻ video thú vị này với bạn:</p>"
                + "<a href='" + link + "' class='button'>Xem video</a>"
                + "</div>"
                + "<div class='footer'>"
                + "<p>Trân trọng,</p>"
                + "<p>PL TUBE</p>"
                + "</div>"
                + "</body>"
                + "</html>";
		return emailContent;
	}
}
