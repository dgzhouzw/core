package org.example.java.core.collections.properties;

import java.io.IOException;
import java.util.Properties;

/**
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 00:54
 * @since JDK17
 */
public class PropertiesTest {
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		properties.load(PropertiesTest.class.getClassLoader().
				getResourceAsStream("user.properties"));
		String username = properties.getProperty("username");
		System.out.println("username = " + username);
		String password = properties.getProperty("password");
		System.out.println("password = " + password);
	}
}
