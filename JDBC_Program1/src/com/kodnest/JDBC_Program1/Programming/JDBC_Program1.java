package com.kodnest.JDBC_Program1.Programming;

//Step-1 Importing java.sql package
import java.sql.*;

public class JDBC_Program1 {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username="root";
		String password="763492@Sree";
		try {
		//Step-2 Loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully");
		
		//Step-3 Establishing the Connection
		DriverManager.getConnection(url,username,password);
		System.out.println("Connection Established Successfully");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

