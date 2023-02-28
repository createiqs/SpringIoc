package com.ciq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.pojo.Employee;
import com.ciq.pojo.GreetingMsg;

public class Client {
	public static void main(String[] args) {
		// bean factory and application context
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		GreetingMsg greeting=(GreetingMsg) context.getBean("message");
		greeting.msg();
		
		Employee employee=(Employee) context.getBean("employee");
		System.out.println(employee);
	}

}
