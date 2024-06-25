package com.kodnest.SpringBoot.Programming.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodnest.SpringBoot.Programming.Entities.Student;
import com.kodnest.SpringBoot.Programming.Services.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService stservo;
	
	@GetMapping("/map-add")
	public String mapAddStudent() {
		return "createStudent";
		
	}
	@PostMapping("/addStudent")
	public String createStudent(@ModelAttribute Student st ) {
		String msg=stservo.CreateStudent(st);
		return msg;
		
	}
	

}
