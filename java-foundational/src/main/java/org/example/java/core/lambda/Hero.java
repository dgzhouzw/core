package org.example.java.core.lambda;

/**
 * 英雄类
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 10:28
 * @since JDK17
 */
public class Hero {
	private String name;
	private String job;
	private Integer blood;

	public Hero() {
	}

	public Hero(String name, String job, Integer blood) {
		this.name = name;
		this.job = job;
		this.blood = blood;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getBlood() {
		return blood;
	}

	public void setBlood(Integer blood) {
		this.blood = blood;
	}

	@Override
	public String toString() {
		return "Hero{" +
				"name='" + name + '\'' +
				", job='" + job + '\'' +
				", blood=" + blood +
				'}';
	}
}
