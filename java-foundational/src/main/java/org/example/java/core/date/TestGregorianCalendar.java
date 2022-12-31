package org.example.java.core.date;

import java.util.GregorianCalendar;

/**
 * GregorianCalendar类
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 21:45
 * @since JDK17
 */
public class TestGregorianCalendar {
	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		// 判断闰年
		boolean leapYear = calendar.isLeapYear(3000);
		System.out.println("leapYear:" + leapYear);

	}
}
