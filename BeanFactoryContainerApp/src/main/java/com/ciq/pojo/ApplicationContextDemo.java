package com.ciq.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		GreetingMsg msg = context.getBean(GreetingMsg.class);
		GreetingMsg greetingMsg = new GreetingMsg(1, "ram");
		System.out.println(msg);
		System.out.println(msg.getId());
	}

}
