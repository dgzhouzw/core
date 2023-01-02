package org.example.java.core.collections.ayyaylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ArrayList相关方法
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 13:20
 * @since JDK17
 */
public class ArrayListTest2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");

		// 集合的循环遍历方式1:
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		System.out.println("===========");

		// 遍历方式2：
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("===========");

		// 遍历方式3:
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("==========");

		// 遍历方式4：
		for (Iterator<String> iterator = list.iterator();iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		System.out.println("===========");

		// 遍历方式5：
		list.forEach(System.out::println);
	}
}
