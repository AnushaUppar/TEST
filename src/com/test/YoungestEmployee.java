package com.test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class YoungestEmployee {
	
	public static void main(String[] args) {
		
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		employeeList.stream()
		.collect(Collectors
				.groupingBy(Employee::getDepartment,
						Collectors.minBy
						(Comparator
								.comparingInt(Employee::getAge))))
		.entrySet().forEach(f->{
			System.out.print(f.getKey()+" -> ");
			Employee employee = f.getValue().get();
			System.out.print(employee.getName());
			System.out.println();
		});
	}

}
