package org.example.java.core.exceptions;


/**
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 15:08
 * @since JDK17
 */
public class Student {

	private int age;
	private String name;

	public Student() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
