package org.example.java.core.collections.ayyaylist;

import java.util.*;

/**
 * ListIterator测试案例
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 13:50
 * @since JDK17
 */
public class ListIteratorTest {
	public static void main(String[] args) {
		// 以下这种方式创建的是一个固定大小的集合，不可以添加、删除数据
		List<String> list = Arrays.asList("AA", "BB", "CC", "DD");
		//list.add("EE");
		//list.remove("BB");
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("========");

		for (Iterator<String> it = list.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
		System.out.println("=========");

		// ListIterator迭代器
		List<String> list1 = new ArrayList<>();
		list1.add("AA");
		list1.add("BB");
		list1.add("CC");
		list1.add("DD");
		ListIterator<String> listIterator = list1.listIterator();
		listIterator.next();
		listIterator.add("EEE");
		System.out.println(list1);
	}
}
