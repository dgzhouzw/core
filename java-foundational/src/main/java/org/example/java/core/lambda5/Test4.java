package org.example.java.core.lambda5;

import java.util.function.Consumer;

/**
 * this和super引用
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 15:50
 * @since JDK17
 */
public class Test4 {
	public static void main(String[] args) {

	}
}

class XX {
	public void test1(String str) {

	}

	public void test2(String str) {
		Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String s) {
				test1(s);
			}
		};
		// lambda
		Consumer<String> consumer1 = (s) -> test1(s);
		// this引用
		Consumer<String> consumer2 = this::test1;
	}
}

class YY extends XX {
	public void test(String str) {
		Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String s) {
				YY.super.test1(s);
			}
		};
		// lambda
		Consumer<String> consumer1 = (s) -> YY.super.test1(s);
		// super引用
		Consumer<String> consumer2 = super::test1;
	}
}