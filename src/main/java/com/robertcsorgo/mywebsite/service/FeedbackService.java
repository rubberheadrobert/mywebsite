package com.robertcsorgo.mywebsite.service;

import com.robertcsorgo.mywebsite.entity.Feedback;
import com.robertcsorgo.mywebsite.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Transactional
    public void createFeedback(Feedback feedback){
        try {
            feedbackRepository.save(feedback);
            System.out.println("added feedback to database");

        }catch (Exception e){
            throw e;
        }
    }

}
