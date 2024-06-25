package com.kodnest.JDBC_Program2.Programming;

//Importing java.sql package
import java.sql.*;

public class JDBC_Program2 {
	public static void main(String[] args) {
		//url,username,password are used for connecting with DB
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username="root";
		String password="763492@Sree";
		
		//Query to create a Table & also query to be executed
		String query="CREATE TABLE STUDENT(ROLLNO INT,NAME VARCHAR(10))";
		//String query="INSERT INTO STUDENT VALUES(1,'Sreenath')";
		
		try {
		//Loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully");
		
		//Establishing the Connection
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("Connection is Established");
		
		//Creating the Statement
		Statement stmt=con.createStatement();
		
		//Executing the Statement
		stmt.execute(query);
		System.out.println("Query is Executed");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}