package org.example.java.core.inner;

/**
 * 成员内部类
 * @author zzw dgzzw1@163.com
 * @version 2022/12/29 21:07
 * @since JDK17
 */
public class Test {

	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner();
		inner.test();
	}
}

class Outer {

	private int x = 10;
	private static int z = 20;

	class Inner {
		int x = 20;

		public void test() {
			System.out.println(x + z);
			// 访问外部类相同名称的成员变量x
			System.out.println(x + "\t" + Outer.this.x);
		}
	}
}
