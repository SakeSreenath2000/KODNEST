package com.kodnest.Spring.Programming.Spring_ProfessorApp_AutoWiring_Using_QualifierAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Config.xml");

		University ur_object1 = (University) ctx.getBean("ur");
		System.out.println(ur_object1);
	}
}
