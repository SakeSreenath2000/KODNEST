package com.kodnest.JDBC_Bank_Project.Programming;
//Importing java.sql package
import java.sql.*;
import java.util.Scanner;
public class TransactionsJDBC {
	public static void main(String[] args) {
		//url,username,password are used for connecting with DB
		String url="jdbc:mysql://localhost:3306/BankDB";
		String username="root";
		String password="763492@Sree";
		
		//creating connection type reference and setting the value as null
		Connection con=null;
		
		//Queries to update the amount in the Bank Table & also queries to be executed
		String query1="update Bank set BalanceAmount=BalanceAmount-? where AccountNo=1111";
		String query2="update Bank set BalanceAmount=BalanceAmount+? where AccountNo=3333";
		try {
			//Establishing the Connection
			con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is Established");
			
			//Step1:-Setting the AutoCommit status as False
			con.setAutoCommit(false);
			
			//Preparing the Statement
			PreparedStatement pstmt1=con.prepareStatement(query1);
			PreparedStatement pstmt2=con.prepareStatement(query2);
			
			//Taking the user input that how much amount should be transferred
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter amount to be transferred");
			int amount=scan.nextInt();
			
			//Setting the statements for completing the query (i.e setting data for placeholder(?))
			pstmt1.setInt(1,amount);
			pstmt2.setInt(1,amount);
			
			//Executing the Statement
			pstmt1.executeUpdate();
			System.out.println("Amount is successfully debitted from AccountNo : 1111");
			pstmt2.executeUpdate();
			System.out.println("Amount is successfully creditted to AccountNo : 3333");
			
			//Step:-2 Committing the Changes
			con.commit();
		}
		catch(Exception e){
			try {
				//Step:-3 If any Problem occurs , rollback the changes
				con.rollback();
				System.out.println("Changes are rolled back");
			} 
			catch (SQLException e1) {
				e1.printStackTrace();
			}
		}	
		
	}

}
