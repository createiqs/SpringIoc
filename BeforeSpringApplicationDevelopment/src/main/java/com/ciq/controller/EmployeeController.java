package com.ciq.controller;

import com.ciq.model.Employee;
import com.ciq.service.EmployeeService;
import com.ciq.service.EmployeeServicerImpl;
//spring mvc 
public class EmployeeController {
// tight coupling
	private EmployeeServicerImpl service = new EmployeeServicerImpl();

	public void save() {
		service.save();
	}

}
