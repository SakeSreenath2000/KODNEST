package com.kodnest.HibernateCRUD_OperationsProject.Programming.HibernateCRUD;

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
		// Calling the create() to create the Person Object(i.e Entity class)
		create(session, tr);
		// Calling the fetchData() to fetch the data from Person Object(i.e Entity class)
		fetchData(session, tr);
		// Calling the updateData() to update the data in Person Object(i.e Entity class)
		updateData(session, tr);
		// Calling the deleteData() to delete the data in Person Object(i.e Entity class)
		deleteData(session, tr);
	}

	public static void create(Session session, Transaction tr) {
		// creating the object of the person class(i.e Entity class)
		Person pr = new Person(11, "Sumit", 21, "sumit@gmail.com", 1234567890L);
		Person pr1 = new Person(12, "Sree", 23, "sree@gmail.com", 7363637363L);
		Person pr2 = new Person(13, "Sofiya", 22, "sofiya@gmail.com", 6363344554L);
		// Save the Object
		session.save(pr);
		session.save(pr1);
		session.save(pr2);
		tr.commit();
		System.out.println("Person Object is created and Saved");
	}

	public static void fetchData(Session session, Transaction tr) {

		session.beginTransaction();
		// Fetching the data from Person Object using get() i.e session.get(Person.class,11)
		Person pr = session.get(Person.class, 11);// Here 11 is Person_Id
		System.out.println(pr);
		tr.commit();
		System.out.println("Person Object Data is Fetched and Displayed");

	}

	public static void updateData(Session session, Transaction tr) {

		session.beginTransaction();
		// Getting Person_Name in the Person Object using get() i.e session.get(Person.class,11)
		Person pr_update = session.get(Person.class, 11); // Here 11 is Person_Id
		// Updating Person_Name in the Person Object using pr_update.setPerson_Name("Akila");
		pr_update.setPerson_Name("Akila");
		session.getTransaction();
		// committing the changes
		tr.commit();
		System.out.println("Person Object is Updated and Saved");

	}

	public static void deleteData(Session session, Transaction tr) {

		session.beginTransaction();
		// Getting the data from the person Object using session.get(Person.class,11);
		Person pr_delete = session.get(Person.class, 11); // Here 11 is Person_Id
		// Deleting the data from the person Object using session.delete(pr_delete);
		session.delete(pr_delete);
		session.getTransaction();
		// committing the changes
		tr.commit();
		System.out.println("Person Object Data is Deleted");

	}

}
