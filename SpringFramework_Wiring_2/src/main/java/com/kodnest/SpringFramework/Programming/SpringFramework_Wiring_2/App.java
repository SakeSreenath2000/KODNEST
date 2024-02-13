package com.kodnest.SpringFramework.Programming.SpringFramework_Wiring_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Config.xml");

		Person pr_object1 = (Person) ctx.getBean("pr1");
		System.out.println(pr_object1);

		Person pr_object2 = (Person) ctx.getBean("pr2");
		System.out.println(pr_object2);

		Person pr_object3 = (Person) ctx.getBean("pr3");
		System.out.println(pr_object3);

		Mobile mob_object1 = (Mobile) ctx.getBean("mob1");
		System.out.println(mob_object1);

		Mobile mob_object2 = (Mobile) ctx.getBean("mob2");
		System.out.println(mob_object2);

		Mobile mob_object3 = (Mobile) ctx.getBean("mob3");
		System.out.println(mob_object3);

	}
}
