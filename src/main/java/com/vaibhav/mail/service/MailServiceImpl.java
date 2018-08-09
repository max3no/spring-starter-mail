package com.vaibhav.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.vaibhav.mail.model.Mail;

@Service
public class MailServiceImpl implements MailService {
	
	
	private JavaMailSender javaMailSender;
	
	@Autowired
	public MailServiceImpl(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}
	
	
	@Override
	public void sendMail(Mail mailModel) throws MailException {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(mailModel.getTo());
		mail.setFrom(mailModel.getFrom());
		mail.setSubject(mailModel.getSubject());
		mail.setText(mailModel.getMessage());
		
		javaMailSender.send(mail);
		
	}
	

}
