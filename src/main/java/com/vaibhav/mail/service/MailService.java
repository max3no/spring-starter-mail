package com.vaibhav.mail.service;

import org.springframework.mail.MailException;

import com.vaibhav.mail.model.Mail;

public interface MailService {


	public void sendMail(Mail mailModel) throws MailException;
}
