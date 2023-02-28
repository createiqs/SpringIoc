package com.ciq.client;

import com.ciq.controller.EmployeeController;

public class EmployeeClient {

	public static void main(String[] args) {
		// object creation
		// loose coupling
		EmployeeController controller = new EmployeeController();
		controller.save();
	}
}
