package com.ciq.controller;

import com.ciq.pojo.Employee;
import com.ciq.service.EmployeeService;
import com.ciq.service.EmployeeServiceImpl;

public class EmployeeController {
	
	private EmployeeServiceImpl employeeServiceImpl;
	
	

	public void setEmployeeServiceImpl(EmployeeServiceImpl employeeServiceImpl) {
		this.employeeServiceImpl = employeeServiceImpl;
	}



	public void save(Employee employee) {
		System.out.println("employee controller........");
		employeeServiceImpl.save(employee);
	}

}
