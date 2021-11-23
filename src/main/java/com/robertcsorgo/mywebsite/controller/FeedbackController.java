package com.robertcsorgo.mywebsite.controller;

import com.robertcsorgo.mywebsite.entity.Feedback;
import com.robertcsorgo.mywebsite.service.EmailSenderService;
import com.robertcsorgo.mywebsite.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FeedbackController {

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private FeedbackService feedbackService;

    @Autowired
    private EmailSenderService emailSenderService;


    @GetMapping("/feedback")
    public String greetingForm(Model model) {
        model.addAttribute("feedback", new Feedback());
        return "feedback";
    }

    @PostMapping("/feedback")
    public String feedbackSubmit(@ModelAttribute Feedback feedback, Model model) {
        model.addAttribute("feedback", feedback);
        feedbackService.createFeedback(feedback);
        return "result";
    }






}
