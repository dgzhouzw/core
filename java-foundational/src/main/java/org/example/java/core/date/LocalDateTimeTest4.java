package org.example.java.core.date;

import java.time.LocalDateTime;

/**
 * 修改日期时间偏移量
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 22:56
 * @since JDK17
 */
public class LocalDateTimeTest4 {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		// 获取3天后的日期时间
		LocalDateTime dateTime1 = dateTime.plusDays(3);
		System.out.println(dateTime1);

		// 获取2天前的日期时间
		LocalDateTime dateTime2 = dateTime.minusDays(2);
		System.out.println(dateTime2);

		// 获取2个月后的日期时间
		LocalDateTime dateTime3 = dateTime.plusMonths(2);
		System.out.println(dateTime3);
	}
}
