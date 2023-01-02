package org.example.java.core.collections.treeset;

import java.util.TreeSet;

/**
 * TreeSet测试
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 22:13
 * @since JDK17
 */
public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(100);
		set.add(80);
		set.add(93);
		set.add(56);
		set.add(24);
		System.out.println(set);

		TreeSet<Student> ts = new TreeSet<>();
		Student s1 = new Student("李白", "男");
		Student s2 = new Student("杜甫", "男");
		ts.add(s1);
		ts.add(s2);
		System.out.println(ts);
	}
}
