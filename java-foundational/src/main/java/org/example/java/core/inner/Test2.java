package org.example.java.core.inner;

/**
 * 局部内部类
 * @author zzw dgzzw1@163.com
 * @version 2022/12/29 21:53
 * @since JDK17
 */
public class Test2 {

}

class OuterLocal {
	private int x = 10;

	private void test2() {

	}

	public void test() {
		int y = 10;

		class InnerLocal {

			public void method() {
				System.out.println(x);
				test2();
			}
		}
		InnerLocal local = new InnerLocal();
		local.method();
	}
}
