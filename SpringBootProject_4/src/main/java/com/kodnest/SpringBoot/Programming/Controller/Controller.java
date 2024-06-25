package com.kodnest.SpringBoot.Programming.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	@GetMapping("create")
	public String Create() {
		return "Creating the Data";
	}
	@GetMapping("read")
	public String Read() {
		return "Reading the Data";
	}
	@GetMapping("update")
	public String Update() {
		return "Updating the Data";
	}
	@GetMapping("delete")
	public String Delete() {
		return "Deleting the Data";
	}
}
