package com.javacodejunkie;

import java.sql.SQLException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws SQLException {

		List<Employee> employees;
		
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		
		employees = employeeDAO.getAll();
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
	}

}
