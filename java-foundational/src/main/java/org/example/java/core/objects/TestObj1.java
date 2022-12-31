package org.example.java.core.objects;

import java.lang.invoke.VarHandle;

/**
 * Object类的方法:equals()
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 15:48
 * @since JDK17
 */
public class TestObj1 {
	public static void main(String[] args) {

		Student student = new Student("张三", "男", 22);
		Student student1 = new Student("张三", "男", 22);
		System.out.println(student1 == student);
		System.out.println(student.equals(student1));
	}
}
