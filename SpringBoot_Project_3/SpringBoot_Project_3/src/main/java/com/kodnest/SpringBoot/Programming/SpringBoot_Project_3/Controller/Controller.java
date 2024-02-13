package com.kodnest.SpringBoot.Programming.SpringBoot_Project_3.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	@GetMapping("create")
	public String Create() {
		return "Creating";
	}
	@GetMapping("read")
	public String Read() {
		return "Reading";
	}
	@GetMapping("update")
	public String Update() {
		return "Updating";
	}
	@GetMapping("delete")
	public String Delete() {
		return "Deleting";
	}
}
