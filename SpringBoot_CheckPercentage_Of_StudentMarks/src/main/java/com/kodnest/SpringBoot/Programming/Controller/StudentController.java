package com.kodnest.SpringBoot.Programming.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/percent")
public class StudentController {
	@PostMapping
	public String calculatePercentage(@RequestParam String NameEntered,int MarksEntered1,int MarksEntered2,int MarksEntered3,int MarksEntered4,int MarksEntered5) {
		double per=((MarksEntered1+MarksEntered2+MarksEntered3+MarksEntered4+MarksEntered5)/500.0)*100.0;
		return NameEntered+" Percentage is : "+per+"%";
		
	}

}
