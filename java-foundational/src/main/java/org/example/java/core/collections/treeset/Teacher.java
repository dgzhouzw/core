package org.example.java.core.collections.treeset;

import java.util.Objects;

/**
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 22:37
 * @since JDK17
 */
public class Teacher {
	private String name;
	private Integer height;

	public Teacher() {
	}

	public Teacher(String name, Integer height) {
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Teacher teacher = (Teacher) o;
		return Objects.equals(name, teacher.name) && Objects.equals(height, teacher.height);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, height);
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"name='" + name + '\'' +
				", height=" + height +
				'}';
	}
}
