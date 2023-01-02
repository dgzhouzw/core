package org.example.java.core.collections.set;

import java.util.Objects;

/**
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 21:28
 * @since JDK17
 */
public class Student {
	private String name;
	private String Gender;

	public Student(String name, String gender) {
		this.name = name;
		Gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("执行了equals方法");
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return Objects.equals(name, student.name) && Objects.equals(Gender, student.Gender);
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", Gender='" + Gender + '\'' +
				'}';
	}

	@Override
	public int hashCode() {
		System.out.println("执行了hashCode方法");
		return Objects.hash(name, Gender);
	}
}
