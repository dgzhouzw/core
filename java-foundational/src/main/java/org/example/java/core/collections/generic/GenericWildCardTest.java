package org.example.java.core.collections.generic;

import org.example.java.core.collections.MyArray;

/**
 * 泛型通配符测试
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 10:15
 * @since JDK17
 */
public class GenericWildCardTest {
	public static void main(String[] args) {
		MyArray<Integer> myArray = new MyArray<>();
		myArray.add(123);
		myArray.add(456);
		myArray.add(789);
		test(myArray);
	}
	// 不知道集合是哪种类型，所以只能进行读取操作，读取到的元素当成Object来处理
	// 可以执行删除
	public static void test(MyArray<?> array) {
		//array.add(100);// 不能再往里面加数据了
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
}
