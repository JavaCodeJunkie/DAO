package com.javacodejunkie;

import java.sql.SQLException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws SQLException {

		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		
		Employee employee = new Employee(0, 246802, "John", "Doe", 5);
		
		int result = employeeDAO.insert(employee);
		
		System.out.println(result);
		
	}

}
