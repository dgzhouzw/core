package org.example.java.core.collections.linkedlist;

import java.io.PrintStream;
import java.util.NoSuchElementException;

/**
 * 自定义链表
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 19:36
 * @since JDK17
 */
public class MyLinkedList<E> {

	// 结点内部类
	private class Node<E> {
		// 下一个节点
		Node<E> next;
		// 节点的元素
		E data;
		// 上一个节点
		Node<E> previous;

		public Node(Node<E> next, E data, Node<E> previous) {
			this.next = next;
			this.data = data;
			this.previous = previous;
		}
	}
	// 第一个节点(头节点)
	private Node<E> first;
	// 最后一个节点(尾节点)
	Node<E> last;
	// 元素的个数
	private int size;

	public MyLinkedList() {

	}

	public MyLinkedList(Node<E> first, Node<E> last, int size) {
		this.first = first;
		this.last = last;
		this.size = size;
	}

	// 返回链表的元素个数
	public int size() {
		return size;
	}

	// 添加元素,将元素加到链表的尾部
	public boolean add(E e) {
		// 将尾节点赋值给l变量
		Node<E> l = last;
		// 创建新节点
		Node<E> newNode = new Node<>(null, e, l);
		// 新节点作为尾节点
		last = newNode;
		// 判断，如果没胡尾节点，则新建节点就是第一个节点
		if (l == null) {
			first = newNode;
		} else {
			l.next = newNode;
		}
		size ++;
		return true;
	}
	// 将元素插入到指定索引位置
	public void add(int index, E e) {
		// 要在链表头部插入数据
		if (index == 0) {
			first = new Node<>(first, e, null);
		} else {
			// 获取上一个结点的元素
			Node<E> prev = node(index - 1);
			// 获取下一个结点的元纱
			Node<E> next = prev.next;
			Node<E> newNode = new Node<>(next, e, prev);
			prev.next = newNode;
		}
		size ++;
	}

	private Node<E> node(int index) {
		// 可以优化，判断查找的index和size的关系
		// 从第一个节点开始找
		Node<E> x = first;
		for (int i = 0; i < index; i++) {
			// 不停找到下一个
			 x = x.next;
		}
		return x;
	}

	public E get(int index) {
		return node(index).data;
	}

	public E getFirst() {
		if (first == null) {
			throw new NoSuchElementException("没有元素");
		}
		return first.data;
	}

	public E getLast() {
		if (last == null) {
			throw new NoSuchElementException("没有元素");
		}
		return last.data;
	}

	// 移除指定索引的元素
	public E remove(int index) {
		// 待删除的元素
		Node<E> node = first;
		if (index == 0) {
			first = node.next;
		} else {
			// 待删除元素的上一个节点
			Node<E> pre = node(index - 1);
			// 待删除的元素
			node = pre.next;
			pre.next = node.next;
		}
		size --;
		return node.data;
	}
}
