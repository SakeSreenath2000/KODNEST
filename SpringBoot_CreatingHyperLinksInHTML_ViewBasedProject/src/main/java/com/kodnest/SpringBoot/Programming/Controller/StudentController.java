package com.kodnest.SpringBoot.Programming.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	@GetMapping("/Cre")
	public String create() {
		return "createStudent";
		
	}
	@GetMapping("/Re")
	public String read() {
		return "readStudent";
		
	}
	@GetMapping("Up")
	public String update() {
		return "updateStudent";
		
	}
	@GetMapping("Del")
	public String delete() {
		return "deleteStudent";
		
	}

}
