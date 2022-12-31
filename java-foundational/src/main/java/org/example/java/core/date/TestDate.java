package org.example.java.core.date;

import java.util.Date;

/**
 * Date类
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 18:04
 * @since JDK17
 */
public class TestDate {
	public static void main(String[] args) {
		Date date = new Date();
		// 2秒之前的时间
		Date date1 = new Date(System.currentTimeMillis() - 2000);
		boolean before = date.before(date1);
		System.out.println("before = " + before);
		boolean after = date.after(date1);
		System.out.println("after = " + after);
		int i = date.compareTo(date1);
		System.out.println("i = " + i);
		boolean equals = date.equals(date1);
		System.out.println("equals = " + equals);
		System.out.println(date);// Sat Dec 31 18:05:30 CST 2022
		// 已被弃用：toLocaleString();
		System.out.println(date.toLocaleString());
		System.out.println(date.toString());
	}

}
