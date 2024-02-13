package com.kodnest.HibernateManyToManyMappingProject_1.Programming.HibernateManyToManyMapping_1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Technology {
	@Id
	int Technology_Id;
	String Technology_Name;
	@ManyToMany
	List<SoftwareEngineer> tech;
	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Technology(int technology_Id, String technology_Name, List<SoftwareEngineer> tech) {
		super();
		Technology_Id = technology_Id;
		Technology_Name = technology_Name;
		this.tech = tech;
	}
	public int getTechnology_Id() {
		return Technology_Id;
	}
	public void setTechnology_Id(int technology_Id) {
		Technology_Id = technology_Id;
	}
	public String getTechnology_Name() {
		return Technology_Name;
	}
	public void setTechnology_Name(String technology_Name) {
		Technology_Name = technology_Name;
	}
	public List<SoftwareEngineer> getTech() {
		return tech;
	}
	public void setTech(List<SoftwareEngineer> tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Technology [Technology_Id=" + Technology_Id + ", Technology_Name=" + Technology_Name + ", tech=" + tech
				+ "]";
	}
	

}
