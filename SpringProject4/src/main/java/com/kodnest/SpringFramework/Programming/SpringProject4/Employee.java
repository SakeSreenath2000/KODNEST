package com.kodnest.SpringFramework.Programming.SpringProject4;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	List<String> Technologies;
	Set<String> Projects;
	Map<String,String> Companies;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(List<String> technologies, Set<String> projects, Map<String, String> companies) {
		super();
		Technologies = technologies;
		Projects = projects;
		Companies = companies;
	}
	public List<String> getTechnologies() {
		return Technologies;
	}
	public void setTechnologies(List<String> technologies) {
		Technologies = technologies;
	}
	public Set<String> getProjects() {
		return Projects;
	}
	public void setProjects(Set<String> projects) {
		Projects = projects;
	}
	public Map<String, String> getCompanies() {
		return Companies;
	}
	public void setCompanies(Map<String, String> companies) {
		Companies = companies;
	}
	@Override
	public String toString() {
		return "Employee [Technologies=" + Technologies + ", Projects=" + Projects + ", Companies=" + Companies + "]";
	}
	
}
