package com.kodnest.SpringFramework.Programming.SpringProject4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Config.xml");
		Employee emp_object=(Employee)ctx.getBean("emp");
		System.out.println(emp_object);
	}
}
