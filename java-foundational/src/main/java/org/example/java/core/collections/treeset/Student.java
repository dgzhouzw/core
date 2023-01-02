package org.example.java.core.collections.treeset;

/**
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 22:17
 * @since JDK17
 */
public class Student implements Comparable<Student> {
	private String name;
	private String gender;

	public Student(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", gender='" + gender + '\'' +
				'}';
	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}
}
