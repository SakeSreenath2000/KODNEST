package com.kodnest.SpringFramework.Programming.SpringProject3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Config.xml");
		Laptop lap1 = (Laptop) ctx.getBean("laptop1");
		Laptop lap2 = (Laptop) ctx.getBean("laptop2");
		System.out.println(lap1);
		System.out.println(lap2);
	}
}
