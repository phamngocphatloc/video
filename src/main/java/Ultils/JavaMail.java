/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ultils;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author exnpt
 */
public class JavaMail {
    public static void sendmail (String emal, String value, String subj){
         // sender
        String senderEmail = "exnpt2908@gmail.com";
        String senderPassword = "twpwhclvwqsvwfhi";
        byte[] ptext = value.getBytes();
        String mess = new String(ptext, StandardCharsets.UTF_8);
        
        // Receiver
        String toEmail = emal;
        //String ccEmail = "abc@fpt.edu.vn, xyz@fpt.edu.vn";
        String subject = subj;
        String message = mess;
        
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.starttls.required", "true");
		properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword); }
        });
        Message msg = new MimeMessage(session);
        try {
            msg.setFrom(new InternetAddress(senderEmail));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail)); 
            msg.setContent(message, "text/html; charset=utf-8");
//            msg.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ccEmail, true));
            msg.setSubject(subject);
            Transport.send(msg);
            System.out.println("Gửi Mail Thành Công");
        } catch (Exception ex) {
        	ex.printStackTrace();
        }
    }
}
