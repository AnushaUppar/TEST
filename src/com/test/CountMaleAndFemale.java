package com.test;

import java.util.List;
import java.util.stream.Collectors;

public class CountMaleAndFemale {

	public static void main(String[] args) {
		
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		employeeList.stream()
					.collect(Collectors
							.groupingBy(Employee::getGender,
									Collectors.counting()))
					.entrySet().forEach(f->{
						System.out.println(f.getKey()+" candidates ->  "+f.getValue());
					});
		
	}
	
}
