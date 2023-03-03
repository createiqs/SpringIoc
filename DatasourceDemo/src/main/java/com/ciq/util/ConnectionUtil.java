package com.ciq.util;

import java.beans.PropertyVetoException;

import org.apache.commons.dbcp.BasicDataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.jboss.C3P0PooledDataSource;

public class ConnectionUtil {
//	drver, url, user, pwd
	private static String url = "jdbc:mysql://localhost:3306/spring_db";
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String user = "root";
	private static String pwd = "root";

	public static void main(String[] args) throws PropertyVetoException {

		BasicDataSource basic = new BasicDataSource();
		basic.setUrl(url);
		basic.setDriverClassName(driver);
		basic.setUsername(user);
		basic.setPassword(pwd);
		System.out.println(basic);

		ComboPooledDataSource c3pO = new ComboPooledDataSource();
		c3pO.setJdbcUrl(url);
		c3pO.setDriverClass(driver);
		c3pO.setUser(user);
		c3pO.setPassword(pwd);
		System.out.println(c3pO);

	}

}
