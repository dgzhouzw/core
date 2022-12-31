package org.example.java.core.objects;

/**
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 17:45
 * @since JDK17
 */
public class TestCloneTeacher {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student student = new Student("李白", "男", 22);

		Teachers teachers = new Teachers();
		teachers.setName("白居易");
		teachers.setStudent(student);

		Teachers teachers1 = (Teachers) teachers.clone();
		teachers.setName("李贺");
		student.setName("杜甫");
		System.out.println(teachers);
		System.out.println(teachers1);
	}
}
