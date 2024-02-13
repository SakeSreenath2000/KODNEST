package com.kodnest.SpringBoot.Programming.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kodnest.SpringBoot.Programming.Entities.Employee;
import com.kodnest.SpringBoot.Programming.Repository.EmpRepository;

@Service
public class EmpServiceImplementation implements EmpService {
	EmpRepository emprepo;

	public EmpServiceImplementation(EmpRepository emprepo) {
		super();
		this.emprepo = emprepo;
	}

	@Override
	public String addEmp(Employee emp) {
		emprepo.save(emp);
		return "Employee Object is Created and Saved";
	}

	@Override
	public Employee getEmpInfo(String empId) {
		Employee e = emprepo.findById(empId).get();
		return e;
	}

	@Override
	public List<Employee> getAllEmpInfo() {
		List<Employee> empList = emprepo.findAll();
		return empList;
	}

	@Override
	public String updateEmp(Employee emp) {
		emprepo.save(emp);
		return "Employee Object is Updated";
	}

	@Override
	public String deleteEmp(String empId) {
		emprepo.deleteById(empId);
		return "Employee Object is Deleted";
	}

}
