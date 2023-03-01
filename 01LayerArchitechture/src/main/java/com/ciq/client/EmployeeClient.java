package com.ciq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.controller.EmployeeController;
import com.ciq.pojo.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		Employee employee = new Employee(1, "anil", 12000.00);
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeController employeeController = (EmployeeController) context.getBean("controller");
		employeeController.save(employee);
//		System.out.println(employeeController);
	}

}
