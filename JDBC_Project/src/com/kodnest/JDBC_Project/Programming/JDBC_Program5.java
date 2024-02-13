package com.kodnest.JDBC_Project.Programming;

//Importing java.sql package
import java.sql.*;

public class JDBC_Program5 {
	public static void main(String[] args) {
		//url,username,password are used for connecting with DB
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username="root";
		String password="763492@Sree";
		
		//Query to delete the row in the Student Table & also query to be executed
		String query="DELETE FROM STUDENT WHERE ROLLNO=1";
		try {
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
