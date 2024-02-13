package com.kodnest.HibernateManyToOneMappingProject.Programming.HibernateManyToOneMapping_1;

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

		Student st1 = new Student(1, "Rohit");
		Student st2 = new Student(2, "Suraj");
		Student st3 = new Student(3, "Manoj");

		Laptop lap1 = new Laptop(1223, "HP", st2);
		Laptop lap2 = new Laptop(1224, "LENOVO", st1);
		Laptop lap3 = new Laptop(1225, "DELL", st2);
		Laptop lap4 = new Laptop(1226, "ASUS", st1);
		Laptop lap5 = new Laptop(1227, "MAC", st3);
		Laptop lap6 = new Laptop(1228, "ACER", st2);
		Laptop lap7 = new Laptop(1229, "MI", st3);

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
