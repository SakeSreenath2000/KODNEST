package com.kodnest.SpringBoot.Programming.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.SpringBoot.Programming.Entities.Student;
import com.kodnest.SpringBoot.Programming.Repositories.StudentRepository;
@Service
public class StudentServiceImplementation implements StudentService {
	@Autowired
	StudentRepository strepo;

	@Override
	public String CreateStudent(Student st) {
		strepo.save(st);
		return "createStudentSuccess";
		
	}

}
