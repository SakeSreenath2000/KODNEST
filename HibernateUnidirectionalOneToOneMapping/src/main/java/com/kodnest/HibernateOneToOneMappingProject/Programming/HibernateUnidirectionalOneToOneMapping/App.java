package com.kodnest.HibernateOneToOneMappingProject.Programming.HibernateUnidirectionalOneToOneMapping;

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
    	
    	Bike bk1=new Bike(1234,"Hero",125000);
    	Bike bk2=new Bike(2233,"Honda",145000);
    	Bike bk3=new Bike(3356,"KTM",195000);
    	
    	Person pr1=new Person(11,"Ajay",23,bk1);
    	Person pr2=new Person(12,"Mohit",23,bk2);
    	Person pr3=new Person(13,"Rakesh",22,bk3);
    	
    	session.save(pr1);
    	session.save(pr2);
    	session.save(pr3);
    	session.save(bk1);
    	session.save(bk2);
    	session.save(bk3);
    	tr.commit();
    	System.out.println("Person and Bike objects are created and saved");
    	System.out.println("Person To Bike One To One Mapping i.e Unidirectional Mapping is Done");
    	
    	
    }
}


