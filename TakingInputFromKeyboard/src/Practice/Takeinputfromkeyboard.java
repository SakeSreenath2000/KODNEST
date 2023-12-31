package Practice;

import java.util.Scanner;

public class Takeinputfromkeyboard {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		System.out.println("Enter the Student First Name:");
		String a =scan.next();
		System.out.println("The first name is "+a);
		System.out.println("Enter Student Last Name");
		String b=scan.next();
		System.out.println("The last name is "+b);
		String s= scan.nextLine();
		System.out.println("Enter the Full Name");
		String Fn=scan.nextLine();
		System.out.println("The student Full Name "+Fn);
		System.out.println("Enter the student age");
		int c=scan.nextInt();
		System.out.println("The student age is "+c);
		System.out.println("Enter Student gender");
		String d=scan.next();
		System.out.println("The student gender is "+d);
		System.out.println("Is student married? say true or false");
		boolean e=scan.nextBoolean();
		System.out.println("The result is "+e);
		System.out.println("Enter the student branch");
		String f=scan.next();
		System.out.println("The Student branch is "+f);
		System.out.println("Enter the height");
		int g=scan.nextInt();
		System.out.println("The Student height is "+g);
		System.out.println("Enter the weight");
		double h=scan.nextDouble();
		System.out.println("The Student weight is "+h);
	}

}
