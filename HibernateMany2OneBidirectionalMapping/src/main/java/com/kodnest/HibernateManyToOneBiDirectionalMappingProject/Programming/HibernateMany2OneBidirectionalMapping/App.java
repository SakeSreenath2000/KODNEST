package com.kodnest.HibernateManyToOneBiDirectionalMappingProject.Programming.HibernateMany2OneBidirectionalMapping;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		// Creating student objects
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		// Creating laptop objects
		Laptop lap1 = new Laptop(1223, "HP", st2);
		Laptop lap2 = new Laptop(1224, "LENOVO", st1);
		Laptop lap3 = new Laptop(1225, "DELL", st2);
		Laptop lap4 = new Laptop(1226, "ASUS", st1);
		Laptop lap5 = new Laptop(1227, "MAC", st3);
		Laptop lap6 = new Laptop(1228, "ACER", st2);
		Laptop lap7 = new Laptop(1229, "MI", st3);
		// Creating list to be assigned for Student
		ArrayList<Laptop> list1 = new ArrayList<Laptop>();
		list1.add(lap2);
		list1.add(lap4);
		// Creating list to be assigned for Student
		ArrayList<Laptop> list2 = new ArrayList<Laptop>();
		list2.add(lap1);
		list2.add(lap3);
		list2.add(lap6);
		// Creating list to be assigned for Student
		ArrayList<Laptop> list3 = new ArrayList<Laptop>();
		list3.add(lap5);
		list3.add(lap7);
		// setting values to student object
		st1.setStudent_RollNo(1);
		st1.setStudent_Name("Rohit");
		st1.setLap(list1);
		// setting values to student object
		st2.setStudent_RollNo(2);
		st2.setStudent_Name("Suraj");
		st2.setLap(list2);
		// setting values to student object
		st3.setStudent_RollNo(3);
		st3.setStudent_Name("Manoj");
		st3.setLap(list3);
		// Saving the sessions
		session.save(st1);
		session.save(st2);
		session.save(st3);
		session.save(lap1);
		session.save(lap2);
		session.save(lap3);
		session.save(lap4);
		session.save(lap5);
		session.save(lap6);
		session.save(lap7);
		tr.commit();
		System.out.println("Student and Laptop objects Created and Saved");
	}
}
