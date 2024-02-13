package com.kodnest.SpringBoot.Programming.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.SpringBoot.Programming.Entities.Student;
import com.kodnest.SpringBoot.Programming.Repositories.StudentRepository;
@Service
public class StudentServiceImplementation implements StudentService{
	@Autowired
	StudentRepository strepo;

	@Override
	public String createStudent(Student st) {
		strepo.save(st);
		return "createStudentSuccess";
	}

	@Override
	public List<Student> readStudent() {
		List<Student> listStudentValues=strepo.findAll();
		return listStudentValues;
	}

	@Override
	public String updateStudent(Student st) {
		strepo.save(st);
		return "updateStudentSuccess";
	}

	@Override
	public String deleteStudent(String RollNo) {
		strepo.deleteById(RollNo);
		return "deleteStudentSuccess";
	}

}
