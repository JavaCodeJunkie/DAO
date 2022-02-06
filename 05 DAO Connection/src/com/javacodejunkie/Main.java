package com.javacodejunkie;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
//		Employee employee = new Employee(1, 123456, "Sam", "Spade", 3);
//		
//		System.out.println(employee);
		
		Connection con = Database.getConnection();
		
		if (con != null) {
			System.out.println("Database connection successful!");
		}
	}

}
