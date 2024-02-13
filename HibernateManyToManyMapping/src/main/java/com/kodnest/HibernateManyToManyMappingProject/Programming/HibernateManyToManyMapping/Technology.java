package com.kodnest.HibernateManyToManyMappingProject.Programming.HibernateManyToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Technology {
	@Id
	int Technology_Id;
	String Technology_Name;
	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Technology(int technology_Id, String technology_Name) {
		super();
		Technology_Id = technology_Id;
		Technology_Name = technology_Name;
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


	@Override
	public String toString() {
		return "Technology [Technology_Id=" + Technology_Id + ", Technology_Name=" + Technology_Name + "]";
	}
}
