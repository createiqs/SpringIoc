package com.ciq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.model.AirtelNetwork;
import com.ciq.model.Network;

public class NetworkTest {
	private static String CONFIG = "spring.xml";

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG);
		Network network=(Network) context.getBean("ciq");
		network.calls();
		network.sms();
	}

}
