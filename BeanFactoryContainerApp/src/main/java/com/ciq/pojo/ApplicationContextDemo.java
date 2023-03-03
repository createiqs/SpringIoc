package com.ciq.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextDemo {

	public static void main(String[] args) {
//		GreetingMsg gm = new GreetingMsg(1, "ram");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		GreetingMsg msg = context.getBean("greetingMsg", GreetingMsg.class);
		msg.setId(1);
		msg.setName("anil");
		System.out.println(msg);
		context.registerShutdownHook();
//
//		GreetingMsg msg2 = context.getBean("greetingMsg", GreetingMsg.class);
//		System.out.println(msg2);
	}
	// request, session, global session, threadsafe

}
