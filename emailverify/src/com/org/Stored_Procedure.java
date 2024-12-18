package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Stored_Procedure {
	public static void main(String[] args) throws SQLException {

		try {
//			load and register
			Class.forName("com.mysql.cj.jdbc.Driver");
//	      Establish The Connection
			Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:3306", "root", "root");

			
			
			
			
			
			
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
