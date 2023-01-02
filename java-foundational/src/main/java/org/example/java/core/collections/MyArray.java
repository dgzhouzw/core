package org.example.java.core.collections;

import java.util.Arrays;

/**
 * 自定义集合类
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 01:31
 * @since JDK17
 */
public class MyArray<E> {
	// 用来存储数据的数组
	private Object[] elementData;
	// 数组中保存了多少个元素
	private int size;
	// 初始大小10
	private static final int DEFAULT_CAPACITY = 10;
	private static final Object[] EMPTY_ELEMENT_DATA[] = {};

	// 无参构造，默认为10
	public MyArray() {
		elementData = new Object[DEFAULT_CAPACITY];
	}

	// 有参构造，由用户指定
	public MyArray(int initialCapacity) {
		if (initialCapacity > 0) {
			elementData = new Object[initialCapacity];
		} else if (initialCapacity== 0) {
			elementData = new Object[] {};
		} else {
			throw new IllegalArgumentException("数组初始参数异常:" + initialCapacity);
		}
	}

	// 返回容器中元素的个数
	public int size() {
		return size;
	}

	public boolean add(E obj) {
		add(obj, elementData, size);
		return true;
	}

	public void add(int index, E obj) {
		if (index > size || index < 0) {
			throw new ArrayIndexOutOfBoundsException("索引长度异常");
		}

		if (size == elementData.length) {
			elementData = grow();
		}
		System.arraycopy(elementData, index, elementData, index + 1, size - index);
		elementData[index] = obj;
		size ++;
	}

	private void add(E obj, Object[] elementData, int s) {
		if (s == elementData.length) {
			elementData = grow();
		}
		elementData[s] = obj;
		size = s + 1;
	}

	/**
	 * 扩容
	 * @return
	 */
	private Object[] grow() {
		return elementData = Arrays.copyOf(elementData,
				elementData.length + (elementData.length >> 1));
	}

	// 取数据
	public E get(int index) {
		if (index >= 0 && index < elementData.length) {
			return (E) elementData[index];
		} else {
			throw new ArrayIndexOutOfBoundsException("索引长度异常");
		}
	}

	// 清空容器
	public void clear() {
		int to = size;
		size = 0;
		for (int i = 0; i < to; i++) {
			elementData[i] = null;
		}
	}

	// 删除元素
	public E remove(int index) {
		if (index > size || index < 0) {
			throw new ArrayIndexOutOfBoundsException("索引长度异常");
		}
		E obj = (E) elementData[index];
		size --;
		if (size > index) {
			System.arraycopy(elementData, index + 1, elementData, index, size - index);
		}
		elementData[size] = null;
		return obj;
	}


}
