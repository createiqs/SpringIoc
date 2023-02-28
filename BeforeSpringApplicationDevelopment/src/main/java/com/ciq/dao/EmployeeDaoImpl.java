package com.ciq.dao;

import java.util.ArrayList;
import java.util.List;

import com.ciq.model.Employee;

// spring JDBC
// spring ORM

public class EmployeeDaoImpl implements EmployeeDao {

	public void save() {
		System.out.println("employee insert");

	}

	public void update() {
		System.out.println("employee update");

	}

	public void delete() {
		System.out.println("employee delete");

	}

	public List<Employee> getAllEmployees() {
		return new ArrayList<Employee>();
	}

}
