package com.kodnest.SpringBoot.Programming.Service;

import java.util.List;

import com.kodnest.SpringBoot.Programming.Entities.Student;

public interface StudentService {
	public String createStudent(Student st);
	public List<Student> readStudent();
	public String updateStudent(Student st);
	public String deleteStudent(String RollNo);

}
