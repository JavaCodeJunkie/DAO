package com.javacodejunkie;

import java.sql.SQLException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws SQLException {

		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		
		Employee employee = employeeDAO.get(10);
		
		System.out.println(employee);
		
		int result = employeeDAO.delete(employee);
		
		System.out.println(result);
		
	}

}
