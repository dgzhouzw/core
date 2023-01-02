package org.example.java.core.collections.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Set集合案例
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 20:58
 * @since JDK17
 */
public class Test {
	public static void main(String[] args) {
		// 唯一性,无序
		Set<String> set = new HashSet<>();
		set.add("sss");
		set.add("abc");
		set.add("ttt");
		set.add("yyy");
		set.add("xxx");
		set.add("aaa");
		set.add("zzz");
		set.add("ccc");
		set.add("ddd");
		set.add("zzz");// 插入数据时，调用equals()，判断两个数据是否相等，如果相等，将原有数据覆盖

		System.out.println(set);
	}
}
