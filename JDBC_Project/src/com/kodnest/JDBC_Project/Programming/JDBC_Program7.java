package com.kodnest.JDBC_Project.Programming;
import java.sql.*;
import java.util.Scanner;
public class JDBC_Program7 {
	public static void main(String[] args) {
		//url,username,password are used for connecting with DB
		String url="jdbc:mysql://localhost:3306/EmployeeDB";
		String username="root";
		String password="763492@Sree";
		String query="INSERT INTO EMPLOYEE VALUES(?,?,?)";
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is Established");
			PreparedStatement pstmt=con.prepareStatement(query);
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter employee id");
			int emp_id=scan.nextInt();
			System.out.println("Enter employee name");
			String emp_name=scan.next();
			System.out.println("Enter employee salary");
			float emp_salary=scan.nextFloat();
			pstmt.setInt(1,emp_id);
			pstmt.setString(2, emp_name);
			pstmt.setFloat(3, emp_salary);
			pstmt.execute();
			System.out.println("Rows are Inserted");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
