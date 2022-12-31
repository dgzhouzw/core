package org.example.java.core.objects;

/**
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 17:44
 * @since JDK17
 */
public class Teachers implements Cloneable {
	private String name;
	private Student student;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Teachers{" +
				"name='" + name + '\'' +
				", student=" + student +
				'}';
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Teachers obj = (Teachers) super.clone();
		obj.student = (Student) this.getStudent().clone();
		return obj;
		//return super.clone();
	}
}

