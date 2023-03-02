package com.ciq.pojo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("spring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Object object = beanFactory.getBean("message");
		GreetingMsg greetingMsg = (GreetingMsg) object;
//		System.out.println(greetingMsg);
		System.out.println("1.--------------------------");
//		greetingMsg.msg();

		GreetingMsg greetingMsg2 = beanFactory.getBean(GreetingMsg.class);
		System.out.println("2.--------------------------");
//		greetingMsg2.msg();

		GreetingMsg greetingMsg3 = beanFactory.getBean("message", GreetingMsg.class);
		System.out.println("3.--------------------------");
//		greetingMsg3.msg();
		System.out.println("4.--------------------------");
		String[] aliasNames = beanFactory.getAliases("gtm");
		for (String string : aliasNames) {
			System.out.println(string);
		}

	}

}
