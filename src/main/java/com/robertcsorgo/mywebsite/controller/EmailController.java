package com.robertcsorgo.mywebsite.controller;

import com.robertcsorgo.mywebsite.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {
    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private EmailSenderService emailSenderService;

    @PostMapping("/email-send")
    public String upload(@RequestParam String name, @RequestParam String subject,
                         @RequestParam String text, Model model){

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("robert.csorgo.website@gmail.com");
        message.setTo("robert.csorgo@gmail.com");

        String body = name + "\n\n" + text;

        message.setText(body);
        message.setSubject(subject);

        model.addAttribute("name", name);

        javaMailSender.send(message);
        System.out.println("Mail send....");


        return "email-sent";
    }

}
