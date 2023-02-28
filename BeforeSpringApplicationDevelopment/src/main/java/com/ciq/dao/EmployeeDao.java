package com.ciq.dao;

import java.util.List;

import com.ciq.model.Employee;

public interface EmployeeDao {

	void save();

	void update();

	void delete();

	List<Employee> getAllEmployees();

}
