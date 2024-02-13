package com.kodnest.SpringBoot.Programming.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodnest.SpringBoot.Programming.Entities.Student;

@RestController
@RequestMapping("stud")
public class StudentController {
	@GetMapping("{kodnestId}")
	public Student getStudentInfo(@PathVariable String kodnestId) {
		Student st=new Student(kodnestId,"Amit",23);
		return st;
	}
	
}
