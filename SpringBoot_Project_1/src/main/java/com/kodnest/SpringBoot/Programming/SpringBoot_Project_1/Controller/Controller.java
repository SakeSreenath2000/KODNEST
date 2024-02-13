package com.kodnest.SpringBoot.Programming.SpringBoot_Project_1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("hello")
	public String welcomeUser() {
		return "I am learning SpringBoot";
	}

}
