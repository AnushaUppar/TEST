package com.test;

import java.util.List;
import java.util.stream.Collectors;

public class NoOfMaleAndFemaleInMarketing {

	public static void main(String[] args) {
		
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		employeeList.stream()
		.filter(f->{
			return (f.getDepartment().equals("Sales")||f.getDepartment().equals("Marketing"));
		
		}).collect(Collectors
				.groupingBy(Employee::getGender,
						Collectors.counting()))
		.entrySet().forEach(f->{
			System.out.println(f.getKey()+" "+f.getValue());
		});;
				
	}
	
}
