package org.example.java.core.collections.generic;

/**
 * 泛型方法测试
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 10:04
 * @since JDK17
 */
public class GenericMethodTest {

	public static void main(String[] args) {
		Student student = new Student("李白", "男");
		GenericMethod method = new GenericMethod();
		method.method1(student);

		Teacher teacher = new Teacher("杜甫", 22);
		GenericMethod m = new GenericMethod();
		m.method1(teacher);

		System.out.println("=====================");

		method.methods(student);
		m.methods(teacher);
	}
}
