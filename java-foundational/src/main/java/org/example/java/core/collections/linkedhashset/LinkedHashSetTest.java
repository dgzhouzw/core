package org.example.java.core.collections.linkedhashset;

import java.util.LinkedHashSet;

/**
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 21:59
 * @since JDK17
 */
public class LinkedHashSetTest {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("ABC");
		set.add("DDD");
		set.add("XXX");
		set.add("YYY");

		System.out.println(set);
	}
}
