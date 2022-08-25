package com.createiq.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NetworkTest {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Network jioNetwork=(Network) context.getBean("airtel");
		jioNetwork.callRates();
		jioNetwork.sms();
		jioNetwork.dataPlans();

	}

}
