package com.example.hhs.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Component
public class EmailUtil {

  @Autowired
  private JavaMailSender javaMailSender;
//  public void sendOtpEmail(String email, String otp) throws MessagingException {
//    MimeMessage mimeMessage = javaMailSender.createMimeMessage();
//    MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
//    mimeMessageHelper.setTo(email);
//    mimeMessageHelper.setSubject("Verify OTP");
//    mimeMessageHelper.setText("""
//        <div>
//          <a href="http://localhost:8080/verify-account?email=%s&otp=%s" target="_blank">click link to verify</a>
//        </div>
//        """.formatted(email, otp), true);
//
//    javaMailSender.send(mimeMessage);
//  }
  public void sendOtpEmail(String email, String otp) throws MessagingException {
	    MimeMessage mimeMessage = javaMailSender.createMimeMessage();
	    MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
	    mimeMessageHelper.setTo(email);
	    mimeMessageHelper.setSubject("Your OTP");

	    String emailBody = String.format("Your OTP is: %s", otp);
	    mimeMessageHelper.setText(emailBody, false); // Set the second parameter to 'false' to indicate plain text email

	    javaMailSender.send(mimeMessage);
	}
  
  public void sendSetPasswordEmail(String email) throws MessagingException {
	    MimeMessage mimeMessage = javaMailSender.createMimeMessage();
	    MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
	    mimeMessageHelper.setTo(email);
	    mimeMessageHelper.setSubject("Set Password");
	    mimeMessageHelper.setText("""
	        <div>
	          <a href="http://localhost:8080/set-password?email=%s" target="_blank">click link to set password</a>
	        </div>
	        """.formatted(email), true);

	    javaMailSender.send(mimeMessage);
	  }
 
}
