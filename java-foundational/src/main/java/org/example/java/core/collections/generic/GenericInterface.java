package org.example.java.core.collections.generic;

/**
 * 泛型接口
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 09:49
 * @since JDK17
 */
public interface GenericInterface<T> {
	void showValue(T value);

}
// 实现时已经指定泛型类型
class Impl implements GenericInterface<String> {

	@Override
	public void showValue(String value) {
		System.out.println(value);
	}
}

// 实现时未指定泛型类型
class Impl2<T> implements GenericInterface<T> {
	@Override
	public void showValue(T value) {
		System.out.println(value);
	}
}