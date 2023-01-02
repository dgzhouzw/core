package org.example.java.core.lambda3;

/**
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 12:06
 * @since JDK17
 */
public class Test {
	public static void main(String[] args) {
		MyInter inter = () -> System.out.println("无参数，无返回值lambda");
		inter.test();

		MyInter1 inter1 = () -> {
			System.out.println("无参多行语句");
			System.out.println("无参多行语句");
		};
		inter1.test();

		MyInter2<String> inter2 = (str) -> System.out.println(str);
		inter2.test("有参，无返回值");

		MyInter3<Integer> inter3 = (num) -> Math.abs(num);
		System.out.println(inter3.abs(-33));

		MyInter4<Double> inter4 = (n1, n2) -> Math.pow(n1, n2);
		System.out.println(inter4.pow(10.0, 2.0));

	}
}
interface MyInter4<T> {
	T pow(T t1, T t2);
}

interface MyInter3<T> {
	T abs(T x);
}

interface MyInter2<T> {
	void test(T t);
}

interface MyInter {
	// 无参数，无返回值，在里面只有一行语句
	void test();
}

interface MyInter1 {
	void test();
}