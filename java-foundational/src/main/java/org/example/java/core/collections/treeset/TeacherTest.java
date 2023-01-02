package org.example.java.core.collections.treeset;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 22:38
 * @since JDK17
 */
public class TeacherTest {
	public static void main(String[] args) {
		TreeSet<Teacher> set = new TreeSet<>(new Comparator<Teacher>() {
			@Override
			public int compare(Teacher o1, Teacher o2) {
				return Integer.compare(o1.getHeight(), o2.getHeight());
			}
		});
		set.add(new Teacher("李白", 178));
		set.add(new Teacher("杜甫", 185));
		set.add(new Teacher("白居易", 173));
		set.add(new Teacher("李商隐", 182));
		System.out.println(set);
	}
}
