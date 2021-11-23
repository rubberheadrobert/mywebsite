package com.robertcsorgo.mywebsite;

import com.robertcsorgo.mywebsite.controller.AppController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.File;

@SpringBootApplication
@ComponentScan({"com.robertcsorgo", "controller"})
public class MywebsiteApplication {

	public static void main(String[] args) {
		new File(AppController.uploadDirectory).mkdir();
		SpringApplication.run(MywebsiteApplication.class, args);
	}

}
