package org.example.java.core.collections.generic;

/**
 * 泛型类
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 09:41
 * @since JDK17
 */
public class GenericClass<T> {
	private T value;

	public GenericClass() {}

	public GenericClass(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "GenericClass{" +
				"value=" + value +
				'}';
	}
}
