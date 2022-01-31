package com.robertcsorgo.mywebsite.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/email-send").setViewName("email-send");
        registry.addViewController("/email-sent").setViewName("email-sent");
        registry.addViewController("/feedback").setViewName("feedback");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/projects").setViewName("projects");
        registry.addViewController("/result").setViewName("result");
    }
}
