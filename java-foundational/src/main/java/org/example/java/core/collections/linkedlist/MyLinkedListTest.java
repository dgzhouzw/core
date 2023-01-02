package org.example.java.core.collections.linkedlist;

/**
 * 自定义链表测试
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 20:00
 * @since JDK17
 */
public class MyLinkedListTest {
	public static void main(String[] args) {
		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		list.add("DDD");
		list.add(0, "XXXX");
		list.add(3, "YYYY");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println("移除之后");
		list.remove(1);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}
