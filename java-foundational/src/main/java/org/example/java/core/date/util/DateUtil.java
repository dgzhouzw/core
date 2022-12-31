package org.example.java.core.date.util;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 封装日期工具类
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 20:17
 * @since JDK17
 */
public class DateUtil {
	private DateUtil(){}

	/**
	 * 获取指定格式的日期和时间
	 * @param pattern 日期和时间的格式
	 * @return
	 */
	private static String getByPattern(String pattern) {
		return new SimpleDateFormat(pattern).format(new Date());
	}

	private static String getByPattern(String pattern, Date date) {
		return new SimpleDateFormat(pattern).format(date);
	}
	/**
	 * 返回当前日期:yyyy-mm-dd
	 * @return
	 */
	public static String getSystemDate() {
		return getByPattern("yyyy-MM-dd");
	}

	public static String getSystemDate(Date date) {
		return getByPattern("yyyy-mm-dd", date);
	}

	/**
	 * 返回当前日期：yyyy年MM月dd日
	 * @return
	 */
	public static String getDefaultDate() {
		return getByPattern("yyyy年MM月dd日");
	}

	/**
	 * 获取24小时制时间
	 * @return
	 */
	public static String getTime24() {
		return getByPattern("HH:mm:ss");
	}

	/**
	 * 获取系统当前日期和时间
	 * @return
	 */
	public static String getSystemDateTime() {
		return getByPattern("yyyy-MM-dd HH:mm:ss");
	}

	public static String getSystemDateTime(Date date) {
		return getByPattern("yyyy-MM-dd HH:mm:ss", date);
	}

	/**
	 * 获取系统默认日期和时间
	 * @return
	 */
	public static String getDefaultDateTime() {
		return getByPattern("yyyy年MM月dd日 HH:mm:ss");
	}

	public static String getWeekDay() {
		return getByPattern("E").replace("周", "星期");
	}

	public static String getAllDateTime() {
		return getByPattern("yyyy-mm-dd HH:mm:sss ") + getWeekDay();
	}

	public static void main(String[] args) {
		System.out.println(getAllDateTime());
	}

	public static Date parse(String pattern, String dateString) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = sdf.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date parse(String dateString) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			sdf.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;

	}
}
