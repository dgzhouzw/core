package org.example.java.core.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 统计字符出现的次数
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 00:17
 * @since JDK17
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请录入一行字符串");
		String str = scanner.next();

		// 1.定义一个map,利用
		Map<Character, Integer> map = new HashMap<>();
		// 2.取出字符串的每个字符，作为键
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (! map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				// value等于取出上次的值+1
				map.put(ch, map.get(ch) + 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entries = map.entrySet();
		for (Map.Entry<Character, Integer> entry : entries) {
			Character key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ":" + value);
		}
	}
}
