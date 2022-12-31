package org.example.java.core.date;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Duration类用例，计算两个日期的间隔
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 23:58
 * @since JDK17
 */
public class DurationTest {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.of(2020, 1, 10, 10, 10, 5);
		LocalDateTime now = LocalDateTime.now();
		Duration duration = Duration.between(dateTime, now);
		// 方式1：
		// 相差多少天
		System.out.println(duration.toDays());
		// 相差多少个小时
		System.out.println(duration.toHours());
		// 相差多少秒
		System.out.println(duration.toSeconds());

		// 方式2：
		// 相差多少天
		long days = dateTime.until(now, ChronoUnit.DAYS);
		System.out.println("days = " + days);
		// 相差多少个小时
		long hours = dateTime.until(now, ChronoUnit.HOURS);
		System.out.println("hours = " + hours);
		// 相差多少秒
		long seconds = dateTime.until(now, ChronoUnit.SECONDS);
		System.out.println("seconds = " + seconds);

		// 方式3:
		// 相差年份
		long years = ChronoUnit.YEARS.between(dateTime, now);
		System.out.println("years = " + years);
		// 相差小时
		hours = ChronoUnit.HOURS.between(dateTime, now);
		System.out.println("hours = " + hours);
	}
}
