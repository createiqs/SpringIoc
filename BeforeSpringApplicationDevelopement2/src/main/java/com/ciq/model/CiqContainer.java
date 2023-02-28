package com.ciq.model;

import java.io.IOException;
import java.util.Properties;

public class CiqContainer {

	public Object getContainer(String name) {
		try {
			Properties properties = new Properties();
			properties.load(CiqContainer.class.getClassLoader().getResourceAsStream("network.properties"));
			return Class.forName(properties.getProperty(name)).newInstance();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
