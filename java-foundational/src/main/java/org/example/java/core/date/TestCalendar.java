package org.example.java.core.date;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar类的使用
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 21:03
 * @since JDK17
 */
public class TestCalendar {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		// 获取方法：get()
		// 获取年份
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year + "年");
		int month = calendar.get(Calendar.MONTH);
		// 月份要加1
		System.out.println(month + 1 + "月");
		int day = calendar.get(Calendar.DATE);
		System.out.println(day + "日");
		// 一周的第几天
		int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("本周的第" + weekDay + "天");
		// 一个月的第几天
		int monthDay = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("本月的第" + monthDay + "天");
		// 一年的第几天
		int yearDay = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("本年的第" +yearDay + "天");
		// 获取小时（12小时制）
		int hour = calendar.get(Calendar.HOUR);
		System.out.println(hour + "时");
		// 获取小时（24小时制）
		int hour24 = calendar.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour24 + "时");
		// 获取分钟
		int minute = calendar.get(Calendar.MINUTE);
		System.out.println(minute + "分钟");
		// 获取秒
		int second = calendar.get(Calendar.SECOND);
		System.out.println(second + "秒");

		// 设置方法set()
		// 设置年月日时分秒
		calendar.set(2000, 5, 12, 22, 22, 22);
		System.out.println(calendar.get(Calendar.YEAR) + "年");
		System.out.println(calendar.get(Calendar.MONTH) + "月");
		System.out.println(calendar.get(Calendar.DATE) + "日");
		// 返回Date类型getTime()
		System.out.println(calendar.getTime());
		// Date转成Calendar:setTime()
		calendar.setTime(new Date());

	}
}
