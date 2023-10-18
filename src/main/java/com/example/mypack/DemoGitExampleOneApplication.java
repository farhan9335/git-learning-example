package com.example.mypack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoGitExampleOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGitExampleOneApplication.class, args);
	}
	
	public String getMessage() {
		return "Hi This git example";
	}

}
