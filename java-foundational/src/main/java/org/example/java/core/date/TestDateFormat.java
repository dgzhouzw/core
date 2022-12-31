package org.example.java.core.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateFormat类
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 18:18
 * @since JDK17
 */
public class TestDateFormat {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		// 对日期进行格式化方式一：
		DateFormat df = DateFormat.getDateInstance();// 年月日
		df = DateFormat.getTimeInstance();// 时间
		df = DateFormat.getDateTimeInstance();//年月日+时间
		String s = df.format(date);
		System.out.println(s);
		System.out.println("-----------------");
		// 对日期进行格式化方式二：
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a E");
		String s2 = df2.format(date);
		System.out.println(s2);

		// 字符串解析为日期
		String str = "1999-12-12";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse(str);
		System.out.println(date1);


	}
}
