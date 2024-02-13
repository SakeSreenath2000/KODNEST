package com.kodnest.HibernateManyToManyMappingProject_1.Programming.HibernateManyToManyMapping_1;

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

		SoftwareEngineer se1 = new SoftwareEngineer(1, "Sumit", 29);
		SoftwareEngineer se2 = new SoftwareEngineer(2, "Sourav", 30);
		SoftwareEngineer se3 = new SoftwareEngineer(3, "Sachin", 28);

		ArrayList<SoftwareEngineer> list1 = new ArrayList<SoftwareEngineer>();
		list1.add(se1);
		list1.add(se2);
		list1.add(se3);

		ArrayList<SoftwareEngineer> list2 = new ArrayList<SoftwareEngineer>();
		list2.add(se1);
		list2.add(se2);

		ArrayList<SoftwareEngineer> list3 = new ArrayList<SoftwareEngineer>();
		list3.add(se2);

		ArrayList<SoftwareEngineer> list4 = new ArrayList<SoftwareEngineer>();
		list4.add(se2);
		list4.add(se2);
		list4.add(se3);

		Technology t1 = new Technology(123, "Java", list1);
		Technology t2 = new Technology(124, "HTML", list2);
		Technology t3 = new Technology(125, "CSS", list3);
		Technology t4 = new Technology(126, "SQL", list4);

		session.save(se1);
		session.save(se2);
		session.save(se3);
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);
		tr.commit();
		System.out.println("SoftwareEngineer and Technology objects Created and Saved");

	}
}
