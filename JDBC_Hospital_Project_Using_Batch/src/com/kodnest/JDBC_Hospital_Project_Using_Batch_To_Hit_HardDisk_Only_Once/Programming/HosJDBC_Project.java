package com.kodnest.JDBC_Hospital_Project_Using_Batch_To_Hit_HardDisk_Only_Once.Programming;
//Importing java.sql package
import java.sql.*;
import java.util.Scanner;

public class HosJDBC_Project {
	public static void main(String[] args) {
		//url,username,password are used for connecting with DB
		String url="jdbc:mysql://localhost:3306/HospitalDB";
		String username="root";
		String password="763492@Sree";
		//Query to insert values in to Hospital Table by placing Placeholder(?) i.e IncompleteQuery & also query to be executed
		String query="INSERT INTO HOSPITAL VALUES(?,?,?)";
		try {
			//Establishing the Connection
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is Established");
			//Preparing the Statement for executing the query with placeholder
			PreparedStatement pstmt=con.prepareStatement(query);
			//Taking the input from the user that how many rows of data has to be inserted
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter how many rows of data should be inserted");
			int rows=scan.nextInt();
			for(int i=1;i<=rows;i++)
			{
				//Taking the input data from the user , completing the query and adding it to Batch
				System.out.println("Enter patient id "+i);
				int patient_id=scan.nextInt();
				System.out.println("Enter patient name "+i);
				String patient_name=scan.next();
				System.out.println("Enter patient Age "+i);
				int patient_age=scan.nextInt();
				//Setting the data to the placeholder(?) i.e for inserting into "query"(Completing the Query)
				pstmt.setInt(1,patient_id);
				pstmt.setString(2, patient_name);
				pstmt.setFloat(3, patient_age);
				pstmt.addBatch();
				
			}
			//Executing the Batch
			pstmt.executeBatch();
			System.out.println("Rows are Inserted");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
