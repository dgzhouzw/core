package org.example.java.core.date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * Instant类用例
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 23:04
 * @since JDK17
 */
public class InstantTest {
	public static void main(String[] args) {
		Instant instant = Instant.now();
		System.out.println(instant);

		Instant max = Instant.MAX;
		System.out.println(max);

		Instant min = Instant.MIN;
		System.out.println(min);
		// 获取毫秒数
		long millis = instant.toEpochMilli();
		System.out.println(millis);

		// 获取中国时间，在东八区
		OffsetDateTime dateTime = instant.atOffset(ZoneOffset.of("+8"));
		System.out.println(dateTime);
		// 转成LocalDateTime类型
		LocalDateTime localDateTime = dateTime.toLocalDateTime();
		System.out.println(localDateTime);

		// 将毫秒数转成Instant类型
		Instant instant1 = Instant.ofEpochMilli(3000000000000L);
		System.out.println(instant1);
	}
}
