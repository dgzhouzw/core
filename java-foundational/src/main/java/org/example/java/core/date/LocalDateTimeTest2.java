package org.example.java.core.date;

import java.time.LocalDateTime;

/**
 * LocalDateTime类用例2
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 22:38
 * @since JDK17
 */
public class LocalDateTimeTest2 {
	public static void main(String[] args) {

		LocalDateTime localDateTime = LocalDateTime.now();
		// 获取年份
		System.out.println(localDateTime.getYear());
		// 获取月份:返回的是枚举类型的数据，英文
		System.out.println(localDateTime.getMonth());
		// 获取月份：数字
		System.out.println(localDateTime.getMonthValue());
		// 获取日
		System.out.println(localDateTime.getDayOfMonth());
		// 获取星期几:返回的也是枚举类型的值，英文
		System.out.println(localDateTime.getDayOfWeek());
		// 获取正确星期几：
		System.out.println(localDateTime.getDayOfWeek().getValue());
		// 获取小时
		System.out.println(localDateTime.getHour());
		// 获取分钟
		System.out.println(localDateTime.getMinute());
		// 获取秒钟
		System.out.println(localDateTime.getSecond());
	}
}
