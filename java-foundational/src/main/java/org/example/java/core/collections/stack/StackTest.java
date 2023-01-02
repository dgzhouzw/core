package org.example.java.core.collections.stack;

import java.util.Stack;

/**
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 08:57
 * @since JDK17
 */
public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("AAA");
		stack.push("BBB");
		stack.push("CCC");
		System.out.println(stack);
		String pop = stack.pop();
		System.out.println("pop = " + pop);
		System.out.println(stack);
	}
}
