package org.example.java.core.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * DateTimeFormatter类的用例
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 23:19
 * @since JDK17
 */
public class DateTimeFormatterTest {

	public static void main(String[] args) {

		// 格式化
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.now();
		String dateString = formatter.format(date);
		System.out.println(dateString);

		formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
		LocalDateTime dateTime = LocalDateTime.now();
		String dateTimeString = formatter.format(dateTime);
		System.out.println(dateTimeString);

		// 将时间戳转换成字符串日期格式
		long millis = Instant.now().toEpochMilli();
		LocalDateTime dateTime1 = LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), ZoneId.of("Asia/Shanghai"));
		String dateTimeString2 = formatter.format(dateTime1);
		System.out.println(dateTimeString2);

		// 将字符串解析成日期
		formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String s3 = "2022-05-01 12:20:30";
		// 方式一：
		TemporalAccessor parse = formatter.parse(s3);
		// 方式二:
		LocalDateTime parse1 = LocalDateTime.parse(s3, formatter);
		System.out.println(parse);
		System.out.println(parse1);
	}
}
