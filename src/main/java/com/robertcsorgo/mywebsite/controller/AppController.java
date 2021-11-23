package com.robertcsorgo.mywebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    public static String uploadDirectory = System.getProperty("user.dir") + "/src/main/resources/static/uploads";

    @RequestMapping("/")
    public String viewHomePage(){
        return "index";
    }

    @RequestMapping("/projects")
    public String viewProjectsPage(){
        return "projects";
    }

    @RequestMapping("/login")
    public String LoginPage(){
        return "login";
    }

    @RequestMapping("/email-send")
    public String sendEmail(){
        return "email-send";
    }





}
