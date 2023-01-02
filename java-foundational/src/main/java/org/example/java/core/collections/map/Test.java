package org.example.java.core.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 初识Map集合
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 23:48
 * @since JDK17
 */
public class Test {
	public static void main(String[] args) {
		// 语文 - 90 数学 -80
		Map<String, Integer> map = new HashMap<>();
		map.put("语文", 90);
		map.put("数学", 80);
		map.put("英语", 70);
		map.put("地理", 95);
		map.put("语文", 80);
		System.out.println(map);

		Integer math = map.get("数学");
		System.out.println("math = " + math);

		// 遍历map
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + "\t" + map.get(key));
		}
		System.out.println("==========");

		// 遍历效率更高一些
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			String key = entry.getKey();
			Integer score = entry.getValue();
			System.out.println(key + "\t" + score);
		}

		boolean b = map.containsKey("数学");
		System.out.println("b = " + b);
		boolean b1 = map.containsValue(80);
		System.out.println("b1 = " + b1);
	}
}
