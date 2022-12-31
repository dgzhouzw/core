package org.example.java.core.date;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Period类用例
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 23:43
 * @since JDK17
 */
public class PeriodTest {
	public static void main(String[] args) {
		// 计算两个日期相隔几年几月几日
		LocalDate date1 = LocalDate.of(2021, 2, 1);
		LocalDate date2 = LocalDate.of(2022, 9, 2);

		Period x = Period.between(date1, date2);
		System.out.println(x.getYears());
		System.out.println(x.getMonths());
		System.out.println(x.getDays());

		// 计算相个日期相隔共多少天,方法1
		long days = ChronoUnit.DAYS.between(date1, date2);
		System.out.println("days = " + days);

		// 计算相个日期相隔共多少天,方法2
		long days1 = date2.toEpochDay() - date1.toEpochDay();
		System.out.println("days1 = " + days1);
	}
}
