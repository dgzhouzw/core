package org.example.java.core.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * 时间调节器用例
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 00:19
 * @since JDK17
 */
public class TemporalAdjusterTest {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		// 获取本周星期一的日期
		LocalDate date1 = date.with(DayOfWeek.MONDAY);
		// 获取下周星期一的日期
		date1 = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		// 获取本月第一天
		date1 = date.with(TemporalAdjusters.firstDayOfMonth());
		// 获取本月最后一天
		date1 = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(date1);
	}
}
