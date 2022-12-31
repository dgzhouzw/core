package org.example.java.core.objects;

/**
 * 克隆方法
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 17:25
 * @since JDK17
 */
public class TestClone {
	public static void main(String[] args) {
		// shallow clone 浅拷贝
		Student student = new Student("李白", "男", 22);
		try {
			Object obj = (Student) student.clone();
			Student stu = (Student) student.clone();
			System.out.println(obj);
			System.out.println(stu);
			System.out.println(stu == student);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
