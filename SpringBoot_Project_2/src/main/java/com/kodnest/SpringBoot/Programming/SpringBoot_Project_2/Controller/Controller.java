package com.kodnest.SpringBoot.Programming.SpringBoot_Project_2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("java")
	public String Java() {
		return "I am a java developer";
	}
	@GetMapping("python")
	public String Python() {
		return "I am a python developer";
	}
	@GetMapping("web")
	public String Web() {
		return "I am a web developer";
	}
	@GetMapping("project")
	public String Project() {
		return "I am working on project";
	}

}
