package com.ciq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client2 {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("com/ciq/config/spring.xml");
		System.out.println(context);
	}

}
