package com.ciq.service;

import com.ciq.dao.EmployeeDao;
import com.ciq.dao.EmployeeDaoImpl;
import com.ciq.pojo.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDaoImpl employeeDaoImpl;

	public void setEmployeeDaoImpl(EmployeeDaoImpl employeeDaoImpl) {
		this.employeeDaoImpl = employeeDaoImpl;
	}

	public void save(Employee employee) {
		System.out.println("employee service impl");
		employeeDaoImpl.save(employee);

	}

}
