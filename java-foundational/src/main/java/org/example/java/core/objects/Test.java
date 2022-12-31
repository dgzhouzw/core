package org.example.java.core.objects;

/**
 * Object类
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 15:44
 * @since JDK17
 */
public class Test {
	public static void main(String[] args) {
		System.out.println(A.class.getSuperclass().getName());
	}
}

class A {

}

class B extends A {

}
