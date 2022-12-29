package org.example.java.core.inner;

/**
 * 匿名内部类
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/29 22:06
 * @since JDK17
 */
public class Test3 {
	public static void main(String[] args) {
		AddInterface inter = new AddImpl();
		OuterAnonymous anonymous = new OuterAnonymous();
		anonymous.testAdd(inter, 10, 20);

		// 使用匿名内部类方式
		AddInterface addInterface = new AddInterface() {
			@Override
			public void add(int x, int y) {
				System.out.println(x + y);
			}
		};
		anonymous.testAdd(addInterface, 100, 200);
	}
}

class OuterAnonymous {

	public void testAdd(AddInterface inter, int x, int y) {
		inter.add(x, y);
	}
}

interface AddInterface {
	void add(int x, int y);
}
// 传统方式，使用一个实现类方式
class AddImpl implements AddInterface {

	@Override
	public void add(int x, int y) {
		System.out.println(x + y);
	}
}
