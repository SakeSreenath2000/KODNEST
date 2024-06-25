package com.kodnest.JDBC_Project.Programming;

//Importing java.sql package
import java.sql.*;

public class JDBC_Program3 {
	public static void main(String[] args) {
		//url,username,password are used for connecting with DB
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username="root";
		String password="763492@Sree";
		
		//Query to insert values in to Student Table & also query to be executed
		String query="INSERT INTO STUDENT VALUES(1,'Sreenath')";
		
		try {
		/* //Loading the Driver is Optional for MySql DB , if we don't load also there is no problem because internally
		   	(or) Automatically it will be loaded but other than MySQL DB like Oracle DB  or any other DBMS softwares we
		   	 have to load them compulsory and it is important if we won't load them we can't execute the Queries.
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully");*/ 
		
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
