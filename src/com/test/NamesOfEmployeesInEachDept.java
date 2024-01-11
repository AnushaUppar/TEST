package com.test;

import java.util.List;
import java.util.stream.Collectors;

public class NamesOfEmployeesInEachDept {

	public static void main(String[] args) {
		
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		employeeList.stream()
		.collect(Collectors
				.groupingBy(Employee::getDepartment)).entrySet().forEach(f->{
					System.out.print("Department Name Is =>  "+f.getKey()+" => Names Are ===> ");
					f.getValue().forEach(g->{
						System.out.print(g.getName()+",");
					});
					System.out.println();
				});
	}
	
}
