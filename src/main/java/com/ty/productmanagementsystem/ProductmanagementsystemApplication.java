package com.ty.productmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.ty.productmanagementsystem.serviceimplement.EmailSenderService;

@SpringBootApplication
public class ProductmanagementsystemApplication {
//@Autowired
//private EmailSenderService emailSenderService;
	public static void main(String[] args) {
		SpringApplication.run(ProductmanagementsystemApplication.class, args);
		 
		
		  
	}
//	@EventListener(ApplicationReadyEvent.class)
//	public void triggerMail() {
//		emailSenderService.sendSimpleEmail("suryayogesh11@gmail.com", "email body", "email subject");
//		
//	}

}
