package com.kodnest.SpringBoot.Programming.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataController {
	@GetMapping("/display")
	public String displayData() {
		return "response";
		
	}

}
