package org.example.java.core.collections.treeset;

import java.util.TreeSet;

/**
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 22:31
 * @since JDK17
 */
public class StaffTest {
	public static void main(String[] args) {
		TreeSet<Staff> set = new TreeSet<>();
		set.add(new Staff("李白", 25, "男"));
		set.add(new Staff("杜甫", 22, "女"));
		set.add(new Staff("白居易", 28, "男"));
		set.add(new Staff("李商隐", 24, "男"));
		System.out.println(set);
	}
}
