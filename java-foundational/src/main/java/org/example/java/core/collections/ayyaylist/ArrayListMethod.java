package org.example.java.core.collections.ayyaylist;

import java.util.ArrayList;

/**
 * ArrayList常用方法
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 16:56
 * @since JDK17
 */
public class ArrayListMethod {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(123);
		list.add(345);
		list.add(111);
		list.add(222);

		// 在索引处插入元素:add(int index, E e)
		list.add(1, 666);
		System.out.println(list);
		System.out.println(list.size());
		boolean empty = list.isEmpty();
		System.out.println(empty);

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(111);
		list1.add(222);
		list1.add(345);

		//list.addAll(list1);
		list.addAll(1, list1);
		//list.remove(Integer.valueOf(111));// 转成Integer
//		list.removeAll(list1);
		boolean b = list.retainAll(list1);
		System.out.println(list1.retainAll(list1));
		System.out.println("list: " + list);


	}
}
