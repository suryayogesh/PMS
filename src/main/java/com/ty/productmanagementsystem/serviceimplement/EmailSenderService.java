package com.ty.productmanagementsystem.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
	@Autowired
	private JavaMailSender javaMailSender;
	
	
	
	public EmailSenderService(JavaMailSender javaMailSender) {
		super();
		this.javaMailSender = javaMailSender;
	}

	public boolean sendSimpleEmail() {
		
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo("arunachalamaro@gmail.com");
		mailMessage.setText("hi guyzzz");
		mailMessage.setSubject("all the best");
		//sendEmail(mailMessage);
		javaMailSender.send(mailMessage);
		System.out.println("mail sent");
		return true;
	}
//	
//	@Async
//    public void sendEmail(SimpleMailMessage email) {
//        javaMailSender.send(email);
//    }
// 

	

}
