package com.ciq.service;

import java.util.List;

import com.ciq.model.Employee;

public interface EmployeeService {
	
	void save();

	void update();

	void delete();

	List<Employee> getAllEmployees();

}
