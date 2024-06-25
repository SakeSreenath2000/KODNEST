package com.kodnest.JDBC_Program7.Programming;

import java.sql.*;
import java.util.Scanner;
public class JDBC_Program7 {
	public static void main(String[] args) {
		//url,username,password are used for connecting with DB
		String url="jdbc:mysql://localhost:3306/EmployeeDB";
		String username="root";
		String password="763492@Sree";
		//Now we will use PlaceHolders (?) because its an incomplete query, here we take input from user  
		String query="INSERT INTO EMPLOYEE VALUES(?,?,?)";
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is Established");
  //PreparedStatement is used when we take data from the user [we use createStatement when we directly assigning data]
			PreparedStatement pstmt=con.prepareStatement(query);
			//Taking the data from the user
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter employee id");
			int emp_id=scan.nextInt();
			System.out.println("Enter employee name");
			String emp_name=scan.next();
			System.out.println("Enter employee salary");
			float emp_salary=scan.nextFloat();
			/*Now setting the data using PreparedStatement reference variable[i.e Using setInt,setString,setFloat..etc]*/
			pstmt.setInt(1,emp_id);
			pstmt.setString(2, emp_name);
			pstmt.setFloat(3, emp_salary);
			/*Now executing the PreparedStatement using prepared Statement reference variable*/
			pstmt.execute();
			System.out.println("Rows are Inserted");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
