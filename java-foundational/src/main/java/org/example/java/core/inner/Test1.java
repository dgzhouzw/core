package org.example.java.core.inner;

/**
 * 静态内部类
 * @author zzw dgzzw1@163.com
 * @version 2022/12/29 21:43
 * @since JDK17
 */
public class Test1 {
	public static void main(String[] args) {
		OuterStatic.InnerStatic innerStatic = new OuterStatic.InnerStatic();
		innerStatic.test();
		OuterStatic.InnerStatic.test1();
	}
}

class OuterStatic {
	private int x = 10;

	public static void test1() {}

	static class InnerStatic {
		private static int y = 20;

		public static void test1() {
			System.out.println("InnerStatic的方法");
		}

		public void test() {
			test1();
			OuterStatic outer = new OuterStatic();
			System.out.println(outer.x);
		}
	}
}
