package com.kodnest.JDBC_Student_Project.Programming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentApp {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/StudentDB";
		String username = "root";
		String password = "763492@Sree";
		String query = "insert into student1 values(?,?,?)";
		try {

			// Establishing the Connection
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is Established");
			PreparedStatement pstmt = con.prepareStatement(query);
			
			Student st1 = new Student(12,"Ankit",78);
			pstmt.setInt(1, st1.RollNo);
			pstmt.setString(2, st1.Name);
			pstmt.setInt(3, st1.Marks);
			pstmt.execute();

			Student st2 = new Student(13,"Amit",84);
			pstmt.setInt(1, st2.RollNo);
			pstmt.setString(2, st2.Name);
			pstmt.setInt(3, st2.Marks);
			pstmt.execute();

			Student st3 = new Student(14,"Anuj",93);
			pstmt.setInt(1, st3.RollNo);
			pstmt.setString(2, st3.Name);
			pstmt.setInt(3, st3.Marks);
			pstmt.execute();

		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
