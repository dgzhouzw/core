package org.example.java.core.collections.ayyaylist;

import java.util.ArrayList;

/**
 * ArrayList测试案例
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 13:13
 * @since JDK17
 */
public class ArrayListTest {

	public static void main(String[] args) {

		// 有顺序的，不唯一
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(23);
		list.add(45);
		list.add(10);
		list.add(10);
		System.out.println(list);
	}
}
