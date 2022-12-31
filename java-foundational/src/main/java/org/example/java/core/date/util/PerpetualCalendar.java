package org.example.java.core.date.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 万年历制作
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 22:04
 * @since JDK17
 */
public class PerpetualCalendar {
	public static void main(String[] args) {
		int year = 2022;
		//int month = 2;
		for (int i = 1; i <=12; i++ ) {

			String txt = getDateTxt(year, i);
			System.out.println(txt);
		}
	}

	public static String getDateTxt(int year, int month) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(year).append("年").append(month).append("月\n").
		append("日\t一\t二\t三\t四\t五\t六\n");
		// 获取Calendar实例
		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, 1);
		int week = c.get(Calendar.DAY_OF_WEEK);
		for (int i = 1; i < week; i++) {
			buffer.append("\t");
		}

		for (int i = 1; i <= getMaxDays(year, month); i++) {
			if ((i + week -1) % 7 == 0) {
				buffer.append(i).append("\n");
			} else {
				buffer.append(i).append("\t");
			}
		}
		buffer.append("\n");
		return buffer.toString();
	}

	private static int getMaxDays(int year, int month) {
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			case 2:
				GregorianCalendar gregorianCalendar = new GregorianCalendar();
				boolean b = gregorianCalendar.isLeapYear(year);
				return b ? 29 : 28;
			default:
				return 30;
		}
	}

}
