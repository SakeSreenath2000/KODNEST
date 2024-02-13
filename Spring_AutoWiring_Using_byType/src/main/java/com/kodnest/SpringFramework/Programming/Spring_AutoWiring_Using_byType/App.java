package com.kodnest.SpringFramework.Programming.Spring_AutoWiring_Using_byType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Config.xml");
		Engine eng_object1 = (Engine) ctx.getBean("eng1");
		System.out.println(eng_object1);

		Car cr_object1 = (Car) ctx.getBean("cr");
		System.out.println(cr_object1);

	}
}
