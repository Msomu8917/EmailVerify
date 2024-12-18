package com.org;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class Verify_Emailpass {
	public static void main(String[] args) {
		Scanner os = new Scanner(System.in);
		System.out.println();
		
		
		
		
		
		
//		Load and register
		lass.forname("com.mysql.cj.jdbc.Driver");
//		Establish Connection
		Connection con = DriverManager.getConnection("jdbc.");
//		Creat platform
		Statement stmt = con.createStatement();
//		Executing Query
		ResultSet rst = stmt.executeQuery("select* from student where email ='"+ email + "'");
		
		if (rst.next()) {
			String dbpwd = rst.getString("password");
			
			if (pwd.equals(dbpwd));
			System.out.println("Welcome to Home Page");
			
			else
				System.out.println("Invalid Password");
			
		} else {
			System.out.println("Invalid Email");
			
			
		}
		
	}

}
