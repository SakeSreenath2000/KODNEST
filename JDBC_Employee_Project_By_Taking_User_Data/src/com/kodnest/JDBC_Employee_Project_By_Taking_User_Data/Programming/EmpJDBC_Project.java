package com.kodnest.JDBC_Employee_Project_By_Taking_User_Data.Programming;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class EmpJDBC_Project {
	public static void main(String[] args) 
	{		
		String url = "jdbc:mysql://localhost:3306/EmployeeDB";
		String username = "root";
		String password = "763492@Sree";
		try 
		{
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
			//Taking input from from user that which method has to executed according to user choice
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your choice:");
			System.out.println("Press1----->For Inserting: ");
			System.out.println("Press2----->For Updating: ");
			System.out.println("Press3----->For Deleting: ");
			System.out.println("Press4----->For FetchingData: ");
			int choice = scan.nextInt();
			switch(choice)
			{
			case 1: insert(con);
				break;
			case 2: update(con);
				break;
			case 3: delete(con);
				break;
			case 4: fetchData(con);
				break;
			default:
				System.out.println("Enter correct choice");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static void insert(Connection con) throws Exception{		
		String query = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee id");
		int emp_id = scan.nextInt();
		System.out.println("Enter employee name");
		String emp_name = scan.next();
		System.out.println("Enter employee salary");
		float emp_salary = scan.nextFloat();
		
		PreparedStatement pstmt = con.prepareStatement(query);
		
		pstmt.setInt(1, emp_id);
		pstmt.setString(2, emp_name);
		pstmt.setFloat(3, emp_salary);
		
		pstmt.execute();
		System.out.println("Rows are inserted");
		fetchData(con);
	}
	public static void update(Connection con) throws Exception{
		String query = "UPDATE EMPLOYEE SET EmpName=? WHERE EmpID=?";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee name");
		String emp_name = scan.next();
		System.out.println("Enter employee id");
		int emp_id = scan.nextInt();
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1, emp_name);
		pstmt.setInt(2, emp_id);
		pstmt.executeUpdate();
		System.out.println("Rows are updated");
		fetchData(con);
	}
	public static void delete(Connection con) throws Exception{
		String query = "DELETE FROM EMPLOYEE WHERE EmpID=?";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee id");
		int emp_id = scan.nextInt();
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, emp_id);
		pstmt.executeUpdate();
		System.out.println("Rows are deleted");
		fetchData(con);
	}
	public static void fetchData(Connection con) throws Exception{
		String query = "SELECT * FROM EMPLOYEE WHERE EmpID = ?";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee id");
		int emp_id = scan.nextInt();
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, emp_id);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
		}
	}
}

