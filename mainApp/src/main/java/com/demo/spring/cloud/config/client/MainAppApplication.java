package com.demo.spring.cloud.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class MainAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainAppApplication.class, args);
	}
}

// @RestController
// @RefreshScope
// class WelcomeService{
//
//   @RefreshScope
// 	@Value("${messages.welcomeMsg}")
//   private String welcomeMsg;
//
//   @RequestMapping("/welcomeMsg")
// 	public ResponseEntity<?> welcome(){
// 		return new ResponseEntity<>(welcomeMsg, HttpStatus.OK);
//
// 	}
// }
