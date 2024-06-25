package com.kodnest.SpringFramework.Programming.Spring_ProfessorApp_AutoWiring_Using_Constructor;

public class Professor {
	int PrId;
	String PrName;
	String PrSubject;

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Professor(int prId, String prName, String prSubject) {
		super();
		PrId = prId;
		PrName = prName;
		PrSubject = prSubject;
	}

	public int getPrId() {
		return PrId;
	}

	public void setPrId(int prId) {
		PrId = prId;
	}

	public String getPrName() {
		return PrName;
	}

	public void setPrName(String prName) {
		PrName = prName;
	}

	public String getPrSubject() {
		return PrSubject;
	}

	public void setPrSubject(String prSubject) {
		PrSubject = prSubject;
	}

	@Override
	public String toString() {
		return "Professor [PrId=" + PrId + ", PrName=" + PrName + ", PrSubject=" + PrSubject + "]";
	}

}
