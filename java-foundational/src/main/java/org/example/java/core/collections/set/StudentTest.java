package org.example.java.core.collections.set;

import java.util.HashSet;

/**
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 21:31
 * @since JDK17
 */
public class StudentTest {
	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<>();
		Student s1 = new Student("李白", "男");
		Student s2 = new Student("李白", "女");

		set.add(s1);
		set.add(s2);

		System.out.println(set);
		//System.out.println(s1.hashCode());
		//System.out.println(s2.hashCode());

		for (Student student : set) {
			System.out.println(student);
		}
	}
}
