package com.kodnest.SpringBoot.Programming.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kodnest.SpringBoot.Programming.Entities.Student;
import com.kodnest.SpringBoot.Programming.Service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService stservo;
	
	@GetMapping("/create")
	public String mapAddStudent() {
		return "createStudent";
		
	}
	@GetMapping("/update")
	public String mapUpdateStudent() {
		return "updateStudent";
		
	}
	@GetMapping("/delete")
	public String mapDeleteStudent() {
		return "deleteStudent";
		
	}
	@PostMapping("/addStudent")
	public String createStudent(@ModelAttribute Student st) {
		String msg=stservo.createStudent(st);
		return msg;
		
	}
	//Accepting request from index.html
	@GetMapping("/fetchStudent")
	public String readStudent(Model model) {
		//Fetching the Student data through Service
		List<Student> listStud=stservo.readStudent();
		//Adding the fetched data into the Model
		model.addAttribute("Students",listStud);
		//Sending the control to viewStudent.html
		return "viewStudent";
	}
	@PostMapping("/updateStudent")
	public String updateStudent(@ModelAttribute Student st) {
		String msg=stservo.updateStudent(st);
		return msg;
	}
	@PostMapping("/deleteStudent")
	public String deleteStudent(@RequestParam String RollNo) {
		String msg=stservo.deleteStudent(RollNo);
		return msg;
	}
	

}
