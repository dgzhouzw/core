package org.example.java.core.collections;

/**
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 01:42
 * @since JDK17
 */
public class MyArrayTest {
	public static void main(String[] args) {
		MyArray<Integer> myArray = new MyArray<>(4);
		myArray.add(1);
		myArray.add(2);
		myArray.add(3);
		myArray.add(4);
		myArray.add(5);
		myArray.add(6);
		myArray.add(7);
		//myArray.add("java");
		System.out.println(myArray.size());
		System.out.println(myArray.get(3));

		myArray.clear();
		System.out.println(myArray.size());
	}
}
