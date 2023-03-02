package com.ciq.dao;

import org.springframework.stereotype.Repository;

import com.ciq.pojo.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	public void save(Employee employee) {
		System.out.println("employee dao impl");

	}

}
