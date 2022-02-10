package com.javacodejunkie;

import java.sql.SQLException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws SQLException {

		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		
		Employee employee = new Employee(8, 336861, "Sam", "Club", 5);
		
		employeeDAO.update(employee);
		
		System.out.println(employee);
		
	}

}
