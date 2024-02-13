package com.kodnest.JDBC_Program6.Programming;

//Importing java.sql package
import java.sql.*;

public class JDBC_Program6 {
	public static void main(String[] args) {
		//url,username,password are used for connecting with DB
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username="root";
		String password="763492@Sree";
		
		//Query to show data from the Student Table & also query to be executed
		String query="SELECT * FROM STUDENT";
		try {
			//Establishing the Connection
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is Established");
			
			//Creating the Statement
			Statement stmt=con.createStatement();
			
			//Executing the Statement
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}	
		
	}

}
