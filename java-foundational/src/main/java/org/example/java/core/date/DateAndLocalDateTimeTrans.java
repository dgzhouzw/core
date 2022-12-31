package org.example.java.core.date;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

/**
 * Date与LocalDateTime转换问题
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 00:29
 * @since JDK17
 */
public class DateAndLocalDateTimeTrans {
	public static void main(String[] args) {
		// LocalDate/LocalDateTime 转成 Date
		LocalDate date = LocalDate.now();
		ZonedDateTime zonedDateTime = date.atStartOfDay().atZone(ZoneId.systemDefault());
		Instant instant = zonedDateTime.toInstant();
		Date date1 = Date.from(instant);
		String s = new SimpleDateFormat("yyyy-MM-dd").format(date1);
		System.out.println(s);

		LocalDateTime dateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime1 = dateTime.atZone(ZoneId.systemDefault());
		Instant instant1 = zonedDateTime1.toInstant();
		Date date2 = Date.from(instant1);
		String s2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date2);
		System.out.println(s2);

		// Date 转成LocalDate
		Date date3 = new Date();
		ZonedDateTime zonedDateTime2 = date3.toInstant().atZone(ZoneId.systemDefault());
		LocalDate localDate = zonedDateTime2.toLocalDate();
		System.out.println(localDate);

		// Date 转成LocalDateTime
		Date date4 = new Date();
		ZonedDateTime zonedDateTime3 = date4.toInstant().atZone(ZoneId.systemDefault());
		LocalDateTime dateTime1 = zonedDateTime3.toLocalDateTime();
		System.out.println(dateTime1);
	}

}
