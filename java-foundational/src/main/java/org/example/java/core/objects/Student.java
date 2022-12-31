package org.example.java.core.objects;

import java.util.Objects;

/**
 * 学生类
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 15:53
 * @since JDK17
 */
public class Student implements Cloneable {
	private String name;
	private String gender;
	private int age;

	public Student(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return age == student.age && Objects.equals(name, student.name) && Objects.equals(gender, student.gender);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, gender, age);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", gender='" + gender + '\'' +
				", age=" + age +
				'}';
	}
}
