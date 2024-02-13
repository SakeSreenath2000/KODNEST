package com.kodnest.SpringFramework.Programming.SpringFramework_Wiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Config.xml");
		Employee emp_Object1 = (Employee) ctx.getBean("emp1");
		System.out.println(emp_Object1);

		Employee emp_Object2 = (Employee) ctx.getBean("emp2");
		System.out.println(emp_Object2);

		CompanyXYZ cmp_Object = (CompanyXYZ) ctx.getBean("cmp");
		System.out.println(cmp_Object);

	}
}
