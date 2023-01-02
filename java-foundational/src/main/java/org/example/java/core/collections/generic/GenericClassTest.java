package org.example.java.core.collections.generic;

/**
 * 泛型类测试
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 09:43
 * @since JDK17
 */
public class GenericClassTest {

	public static void main(String[] args) {
		GenericClass<Integer> generic = new GenericClass<>();
		generic.setValue(123);
		System.out.println(generic.getValue());
		System.out.println(generic);

		GenericClass<String> generic2 = new GenericClass<>("Java");
		System.out.println(generic2.getValue());
		System.out.println(generic2);


	}
}
