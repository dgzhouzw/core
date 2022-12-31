package org.example.java.core.date;

import java.time.LocalDate;

/**
 * LocalDate日期修改
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 22:48
 * @since JDK17
 */
public class LocalDateTest3 {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

		// 获取本月的第10天，日期
		LocalDate localDate1 = localDate.withDayOfMonth(10);
		System.out.println(localDate1);
		// 修改年份
		LocalDate localDate2 = localDate1.withYear(2021);
		System.out.println(localDate2);
		// 修改月份
		LocalDate localDate3 = localDate1.withMonth(10);
		System.out.println(localDate3);
	}
}
