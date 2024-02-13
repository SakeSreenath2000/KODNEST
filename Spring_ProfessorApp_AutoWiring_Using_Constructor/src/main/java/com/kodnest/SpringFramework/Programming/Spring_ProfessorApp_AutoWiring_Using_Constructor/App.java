package com.kodnest.SpringFramework.Programming.Spring_ProfessorApp_AutoWiring_Using_Constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Config.xml");
		Professor pr_object1 = (Professor) ctx.getBean("prof");
		System.out.println(pr_object1);
		
		University ur_object1 = (University) ctx.getBean("ur");
		System.out.println(ur_object1);
    }
}
