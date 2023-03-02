package com.ciq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ciq.dao.EmployeeDao;
import com.ciq.dao.EmployeeDaoImpl;
import com.ciq.pojo.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDaoImpl employeeDaoImpl;

//	public EmployeeServiceImpl(EmployeeDaoImpl employeeDaoImpl) {
//		this.employeeDaoImpl = employeeDaoImpl;
//	}

//	public void setEmployeeDaoImpl(EmployeeDaoImpl employeeDaoImpl) {
//		this.employeeDaoImpl = employeeDaoImpl;
//	}

	public void save(Employee employee) {
		System.out.println("employee service impl");
		employeeDaoImpl.save(employee);

	}

}
