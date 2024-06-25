package com.kodnest.SpringFramework.Programming.SpringProject1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("Config.xml");
    	Student st_object=(Student)ctx.getBean("st");
        System.out.println(st_object);
    }
}
