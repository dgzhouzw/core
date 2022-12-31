package org.example.java.core.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * JDK8新增日期类
 * LocalDate
 * LocalTime
 * LocalDateTime
 * 的用例
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 22:27
 * @since JDK17
 */
public class LocalDateTimeTest {
	public static void main(String[] args) {
		// 获取当前系统日期
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

		// 获取当前系统时间
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);

		// 获取当前系统日期时间
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

		// 设置日期
		LocalDate date = LocalDate.of(2022, 9, 2);
		System.out.println(date);

		// 设置时间
		LocalTime time = LocalTime.of(22, 22, 33);
		System.out.println(time);

		// 设置日期和时间
		LocalDateTime dateTime = LocalDateTime.of(2022, 12, 1, 12, 22, 33);
		System.out.println(dateTime);
	}

}
