package com.kodnest.HibernateOneToOneMappingProject.Programming.HibernateBidirectionalOneToOneMapping;

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
    	
    	Person pr1=new Person();
    	Person pr2=new Person();
    	Person pr3=new Person();
    	
    	Bike bk1=new Bike(1234,"Hero",125000,pr1);
    	Bike bk2=new Bike(2233,"Honda",145000,pr2);
    	Bike bk3=new Bike(3356,"KTM",195000,pr3);
    	
//Using Setter methods we assign values to person_id,person_name and person_age for pr1 , pr2 ,pr3 Person Objects
    	pr1.setPerson_id(11);
    	pr1.setPerson_name("Ajay");
    	pr1.setPerson_age(26);
    	pr1.setBike(bk1);
    	
    	pr2.setPerson_id(12);
    	pr2.setPerson_name("Mohit");
    	pr2.setPerson_age(25);
    	pr2.setBike(bk2);
    	
    	pr3.setPerson_id(13);
    	pr3.setPerson_name("Rakesh");
    	pr3.setPerson_age(29);
    	pr3.setBike(bk3);
    	
    	
    	session.save(pr1);
    	session.save(pr2);
    	session.save(pr3);
    	session.save(bk1);
    	session.save(bk2);
    	session.save(bk3);
    	tr.commit();
    	System.out.println("Person and Bike objects are created and saved");
    	System.out.println("Person To Bike and Bike To Person One To One Mapping i.e Bidirectional Mapping is Done");
    	
    	
    }
}


