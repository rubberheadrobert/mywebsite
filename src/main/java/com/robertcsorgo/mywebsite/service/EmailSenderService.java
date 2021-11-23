package com.robertcsorgo.mywebsite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendSimpleEmail(String body, String subject){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("robert.csorgo.website@gmail.com");
        message.setTo("robert.csorgo@gmail.com");
        message.setText(body);
        message.setSubject(subject);

        mailSender.send(message);
        System.out.println("Mail send....");


    }
}
