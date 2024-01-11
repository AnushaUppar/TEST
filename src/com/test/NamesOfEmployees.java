package com.test;

import java.util.List;

public class NamesOfEmployees {

	public static void main(String[] args) {
		
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		System.out.println("NAMES OF THE EMPLOYEES WHO ARE JOINED AFTER 2015");
		employeeList.stream()
		.filter(f-> f.getYearOfJoining()>2015)
		.forEach(f->{
			System.out.println("Name is -> "+ f.getName());
		});
	}
	
}
