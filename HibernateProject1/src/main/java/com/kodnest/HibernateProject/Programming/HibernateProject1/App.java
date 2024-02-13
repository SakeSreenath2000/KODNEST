package com.kodnest.HibernateProject.Programming.HibernateProject1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction tr=session.beginTransaction();
    	Person pr1=new Person(1,"Sreenath",23);
    	Person pr2=new Person(2,"Sofiya",23);
    	Person pr3=new Person(3,"Akila",22);
    	Bike bk1=new Bike(548446637,"Honda",120000);
    	Bike bk2=new Bike(303943933,"Pulsar",150000);
    	Bike bk3=new Bike(564747746,"KTM",200000);
    	session.save(pr1);
    	session.save(pr2);
    	session.save(pr3);
    	session.save(bk1);
    	session.save(bk2);
    	session.save(bk3);
    	tr.commit();
    	 System.out.println("Person and Bike objects are created and saved");
    	
    	
    }
}
