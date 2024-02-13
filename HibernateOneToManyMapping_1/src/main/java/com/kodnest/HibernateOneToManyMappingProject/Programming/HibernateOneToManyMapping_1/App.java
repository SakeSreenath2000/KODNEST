package com.kodnest.HibernateOneToManyMappingProject.Programming.HibernateOneToManyMapping_1;

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

		Laptop lap1 = new Laptop(1223, "HP");
		Laptop lap2 = new Laptop(1224, "LENOVO");
		Laptop lap3 = new Laptop(1225, "DELL");
		Laptop lap4 = new Laptop(1226, "ASUS");
		Laptop lap5 = new Laptop(1227, "MAC");
		Laptop lap6 = new Laptop(1228, "ACER");
		Laptop lap7 = new Laptop(1229, "MI");

		ArrayList<Laptop> list1 = new ArrayList<Laptop>();
		list1.add(lap2);
		list1.add(lap4);

		ArrayList<Laptop> list2 = new ArrayList<Laptop>();
		list2.add(lap1);
		list2.add(lap3);
		list2.add(lap6);

		ArrayList<Laptop> list3 = new ArrayList<Laptop>();
		list3.add(lap5);
		list3.add(lap7);

		Student st1 = new Student(1, "Rohit",list1);
		Student st2 = new Student(2, "Suraj",list2);
		Student st3 = new Student(3, "Manoj",list3);

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
