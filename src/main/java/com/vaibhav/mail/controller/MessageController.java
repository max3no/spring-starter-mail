package com.vaibhav.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhav.mail.model.Mail;
import com.vaibhav.mail.service.MailService;

@RestController
@RequestMapping("/api/v1")
public class MessageController {
	
//	@pathvariable, @requestparams, @requestbody
	
	@Autowired
	MailService mailService;
	
	@PostMapping("/mail")
	public ResponseEntity<?> sendMail(@RequestBody Mail mailModel) {
		
		try{
			mailService.sendMail(mailModel);
			return ResponseEntity.ok("Send Successfully");
		}catch(MailException m) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(m.getMessage());
		}
	}

}
