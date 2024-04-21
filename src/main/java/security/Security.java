package security;

import org.apache.commons.codec.digest.DigestUtils;

public class Security {
	public static String hashPassword(String password) {
        return DigestUtils.sha256Hex(password); // Sử dụng SHA-256 để băm mật khẩu
    }
	
	public static boolean EqualsPassword(String password, String hash) {
        if (DigestUtils.sha256Hex(password).equals(hash)) {
        	return true;
        }
		return false;
        
    }
}
