package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ciq.pojo.Employee;
import com.ciq.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	

//	public EmployeeController(EmployeeServiceImpl employeeServiceImpl) {
//		this.employeeServiceImpl = employeeServiceImpl;
//	}

//	public void setEmployeeServiceImpl(EmployeeServiceImpl employeeServiceImpl) {
//		this.employeeServiceImpl = employeeServiceImpl;
//	}

	public void save(Employee employee) {
		System.out.println("employee controller........");
		employeeServiceImpl.save(employee);
		System.out.println(employee);
	}

	public void update(Employee employee) {
		System.out.println("employee controller update........");
	}

}
