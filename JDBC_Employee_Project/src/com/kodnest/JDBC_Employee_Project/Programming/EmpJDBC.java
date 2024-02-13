package com.kodnest.JDBC_Employee_Project.Programming;

import java.util.Scanner;
import java.sql.*;
public class EmpJDBC {
	public static void main(String[] args) {
		//url,username,password are used for connecting with DB
		String url="jdbc:mysql://localhost:3306/EmployeeDB";
		String username="root";
		String password="763492@Sree";
		try {
			//Establishing the Connection
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is Established");
			
			//Creating the Statement
			Statement stmt=con.createStatement();
			
			//Taking input from from user that which method has to executed according to user choice
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter User Choice: ");
			System.out.println("Press1----->For Inserting: ");
			System.out.println("Press2----->For Updating: ");
			System.out.println("Press3----->For Deleting: ");
			System.out.println("Press4----->For FetchingData: ");
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				insert(stmt);
				break;
			case 2:
				update(stmt);
				break;
			case 3:
				delete(stmt);
				break;
			case 4:
				fetchdata(stmt);
				break;
			default:
				System.out.println("Enter Correct Choice");
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public static void insert(Statement stmt) throws Exception {
		//Query to insert values in to Employee Table & also query to be executed
		String query="INSERT INTO EMPLOYEE VALUES(789,'Sreenath',30000.50),(707,'Akhila',55000.50),(671,'Bhagya',65000.50)";
		try {
			//Executing the Statement
			stmt.execute(query);
			System.out.println("Query is Executed");
			fetchdata(stmt);
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
				
	}
	public static void update(Statement stmt) throws Exception{
		//Query to update values in to Employee Table & also query to be executed
		String query="UPDATE EMPLOYEE SET EmpID=706 WHERE EmpName='Akhila'";
		try {
			//Executing the Statement
			stmt.executeUpdate(query);
			System.out.println("Query is Executed");
			fetchdata(stmt);
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public static void delete(Statement stmt) throws Exception{
		//Query to delete values from Employee Table & also query to be executed
		String query="DELETE FROM EMPLOYEE WHERE EmpName='Akhila'";
		try {
			//Executing the Statement
			stmt.execute(query);
			System.out.println("Query is Executed");
			fetchdata(stmt);
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public static void fetchdata(Statement stmt) throws Exception{
		//Query to show data from Employee Table & also query to be executed
		String query="SELECT * FROM EMPLOYEE";
		try {
			//Executing the Statement
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
			}
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
