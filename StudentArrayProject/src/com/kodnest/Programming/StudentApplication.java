package com.kodnest.Programming;

import java.util.Scanner;

public class StudentApplication {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		  
		  //Asking the total number of students
		  System.out.println("Enter the number of student objects : ");
		  int studentCount = scan.nextInt();
		  
		  //Creating the array for storing the student objects
		  Student [] arr = new Student[studentCount];
		  
		  //Creating and storing the students objects in the array
		  for(int i=0 ; i<=arr.length-1; i++)
		  {
			  /* System.out.println("Enter the rollNumber of Student "+(i+1));
			  int rollNumber=scan.nextInt();
			  System.out.println("Enter the Name of Student "+(i+1));
			  String Name=scan.next();
			  System.out.println("Enter the age of Student "+(i+1));
			  int age=scan.nextInt();
			  arr[i] = new Student(rollNumber,Name,age); */
			  System.out.println("Enter the rollNumber , Name and age of Student "+(i+1));
			  arr[i] = new Student(scan.nextInt(), scan.next(), scan.nextInt());
		  }
		  
		  //Displaying the student object details stored in the array
		  System.out.println("The students details are: ");
		  for(int i=0 ; i<=arr.length-1 ; i++)
		  {
			  //System.out.println(arr[i].rollNumber+" "+arr[i].Name+" "+arr[i].age);
			  System.out.print(arr[i].rollNumber+" "+arr[i].Name+" "+arr[i].age+"||");
		  }
		  
	}

}
