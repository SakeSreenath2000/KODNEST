package com.kodnest.SpringBoot.Programming.Service;

import java.util.List;

import com.kodnest.SpringBoot.Programming.Entities.Employee;

public interface EmpService {
	public String addEmp(Employee emp);

	public Employee getEmpInfo(String empId);

	public List<Employee> getAllEmpInfo();

	public String updateEmp(Employee emp);

	public String deleteEmp(String empId);

}
