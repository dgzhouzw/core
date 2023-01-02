package org.example.java.core.collections.generic;

/**
 * 泛型接口测试
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 09:52
 * @since JDK17
 */
public class GenericInterfaceTest {
	public static void main(String[] args) {
		GenericInterface<String> x = new Impl();
		x.showValue("JavaSE");

		GenericInterface<String> x2 = new Impl2<>();
		x2.showValue("JavaEE");
	}
}
