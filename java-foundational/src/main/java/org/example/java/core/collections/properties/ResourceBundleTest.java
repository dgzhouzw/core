package org.example.java.core.collections.properties;

import java.util.ResourceBundle;

/**
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 08:40
 * @since JDK17
 */
public class ResourceBundleTest {
	public static void main(String[] args) {
		// 只写文件名，不写扩展名
		ResourceBundle bundle = ResourceBundle.getBundle("user");
		String username = bundle.getString("username");
		System.out.println("username = " + username);
		String password = bundle.getString("password");
		System.out.println("password = " + password);
	}
}
