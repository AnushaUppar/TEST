package com.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;


public class JUnit {

	
	@Test
	public boolean getEmpName(String name) {
		
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		for(Employee ele :employeeList) {
			if(ele.getName().equals(name)) {
				return true;		
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		
		JUnit unit = new JUnit();
		String name ="Ram";
		boolean empName = unit.getEmpName(name);
		assertEquals(empName, true);
		
		
	}
	
	
	
	
}
