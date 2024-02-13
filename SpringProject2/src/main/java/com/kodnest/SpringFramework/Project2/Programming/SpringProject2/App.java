package com.kodnest.SpringFramework.Project2.Programming.SpringProject2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("Sreenath.xml");/*i.e XML file in
    														Spring can be in any name , it is not fixed format
    														as "hibernate.cfg.xml" as used in Hibernate so here
    														i've used my name to show that XML file in spring
    														can have any name with extension of ".xml"*/
    	JavaTeacher Jt_object=(JavaTeacher)ctx.getBean("jt");
    	System.out.println(Jt_object);
    	
    	SQLTeacher St_object=(SQLTeacher)ctx.getBean("st");
    	System.out.println(St_object);
    	
    	PythonTeacher Pt_object=(PythonTeacher)ctx.getBean("pt");
    	System.out.println(Pt_object);
    	
    	
    }
}
