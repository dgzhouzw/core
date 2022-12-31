package org.example.java.core.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * trhow抛出异常
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 15:07
 * @since JDK17
 */
public class Test4 {

	public static void main(String[] args) {
		Student student = new Student(1, "李白");
		checkStudent(student);
	}

	public static void checkStudent(Student student)  {
		if (student.getAge() < 6 || student.getAge() > 12) {
			// 运行时异常
			throw new AgeException("年龄必须在6-12之间");
		}

		if (student.getName().length() < 2) {
			// 编译异常，必须要处理
			try {
				throw new NameException("姓名长度必须大于2");
			} catch (NameException e) {
				e.printStackTrace();
			}
		}
	}
}
