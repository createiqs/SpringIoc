package com.createiq.model;

import java.io.IOException;
import java.util.Properties;

public class CreateIQContainer {

	public Object getNetwork(String name) {
		Properties prop = new Properties();

		try {
			prop.load(CreateIQContainer.class.getClassLoader().getResourceAsStream("network.properties"));
			return Class.forName(prop.getProperty(name)).newInstance();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return name;

	}

}
