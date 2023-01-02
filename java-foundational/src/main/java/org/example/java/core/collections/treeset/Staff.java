package org.example.java.core.collections.treeset;

import java.util.Objects;

/**
 * 员工类
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 22:28
 * @since JDK17
 */
public class Staff implements Comparable<Staff> {
	private String name;
	private Integer age;
	private String gender;

	public Staff() {
	}

	public Staff(String name, Integer age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Staff{" +
				"name='" + name + '\'' +
				", age=" + age +
				", gender='" + gender + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Staff staff = (Staff) o;
		return Objects.equals(name, staff.name) && Objects.equals(age, staff.age) && Objects.equals(gender, staff.gender);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age, gender);
	}

	@Override
	public int compareTo(Staff o) {
		// 按照哪个属性进行排序
		// 小于传入参数，返回-1，相同，返回0，大于返回1

		return Integer.compare(this.age, o.age);
	}
}
