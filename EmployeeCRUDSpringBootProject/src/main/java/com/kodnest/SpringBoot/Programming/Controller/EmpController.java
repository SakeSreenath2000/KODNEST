package com.kodnest.SpringBoot.Programming.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kodnest.SpringBoot.Programming.Entities.Employee;
import com.kodnest.SpringBoot.Programming.Service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {
	EmpService empServo;

	public EmpController(EmpService empServo) {
		super();
		this.empServo = empServo;
	}

	@PostMapping
	public String addEmp(@RequestBody Employee emp) {
		String msg = empServo.addEmp(emp);
		return msg;
	}

	@GetMapping(value = "{empId}")
	public Employee getEmpInfo(@PathVariable String empId) {
		Employee e = empServo.getEmpInfo(empId);
		return e;

	}

	@GetMapping
	public List<Employee> getAllEmpInfo() {
		List<Employee> empListObjects = empServo.getAllEmpInfo();
		return empListObjects;

	}

	@PutMapping
	public String updateEmp(@RequestBody Employee emp) {
		String msg = empServo.updateEmp(emp);
		return msg;

	}

	@DeleteMapping(value = "{empId}")
	public String deleteEmp(@PathVariable String empId) {
		String msg = empServo.deleteEmp(empId);
		return msg;

	}

}
