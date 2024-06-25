package com.kodnest.StudentArrayProjectByUsingEncapsulation.Programming;

public class StudentApp {
	public static void main(String[] args) {
		//Creating Student object
		Student st=new Student();
		
		//Below Errors , because we are accessing the private Data Members DIRECTLY
		st.rollNo=11;
		st.name="Ajay";
		st.age=24;
		
		//Below Errors , because we are accessing the private Data Members DIRECTLY
		System.out.println(st.rollNo);
		System.out.println(st.name);
		System.out.println(st.age);
		
		//To Access the private Data Members we have to access it INDIRECTLY using public setter method
		st.setData(11,"Ajay",24);
		
		//To Access the private Data Members we have to access it INDIRECTLY using public getter method
		System.out.println(st.getAge());
		System.out.println(st.getName());
		System.out.println(st.getAge());
		
	}

}
