package com.ciq.service;

import java.util.List;

import com.ciq.dao.EmployeeDaoImpl;
import com.ciq.model.Employee;
// spring web-serivces restful webservice, json , soap -->xml
public class EmployeeServicerImpl implements EmployeeService {

	//dependency, new key word
	private EmployeeDaoImpl dao = new EmployeeDaoImpl();

	public void save() {
		//4
		dao.save();

	}

	public void update() {
		dao.update();

	}

	public void delete() {
		dao.delete();

	}

	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}

}
