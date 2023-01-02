package org.example.java.core.collections.linkedlist;

import java.util.LinkedList;

/**
 * LinkedList测试用例
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 20:35
 * @since JDK17
 */
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		list.addFirst("XXX");
		list.addLast("DDD");
		list.add(2, "YYY");

		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("first:" + list.getFirst());
		System.out.println("last: " + list.getLast());
	}
}
