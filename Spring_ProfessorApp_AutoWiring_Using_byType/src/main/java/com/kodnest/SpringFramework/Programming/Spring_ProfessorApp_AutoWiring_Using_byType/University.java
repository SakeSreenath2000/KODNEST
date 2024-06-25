package com.kodnest.SpringFramework.Programming.Spring_ProfessorApp_AutoWiring_Using_byType;

public class University {
	Professor prof;

	public University() {
		super();
		// TODO Auto-generated constructor stub
	}

	public University(Professor prof) {
		super();
		this.prof = prof;
	}

	public Professor getProf() {
		return prof;
	}

	public void setProf(Professor prof) {
		this.prof = prof;
	}

	@Override
	public String toString() {
		return "University [prof=" + prof + "]";
	}

}
