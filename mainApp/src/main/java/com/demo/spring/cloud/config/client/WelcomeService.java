package com.demo.spring.cloud.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RefreshScope
public class WelcomeService{

	@Value("${messages.welcomeMsg}")
  private String welcomeMsg;

  @RequestMapping("/welcomeMsg")
	public ResponseEntity<?> welcome(){
		return new ResponseEntity<>(welcomeMsg, HttpStatus.OK);

	}
}
