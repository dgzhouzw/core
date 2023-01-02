package org.example.java.core.collections.util;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections工具类
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 23:05
 * @since JDK17
 */
public class CollectionsToolTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(25);
		list.add(46);
		list.add(32);
		list.add(10);
		list.add(98);
		/*
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1, o2);
			}
		});

		 */
		System.out.println(list);
		/*
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1, o2);
			}
		});
		 */
		Collections.sort(list);
		System.out.println(list);

		// shuffle(List list):打乱
		Collections.shuffle(list);
		System.out.println(list);

		// 交换数据
		Collections.swap(list, 0, 4);
		System.out.println(list);
	}
}
