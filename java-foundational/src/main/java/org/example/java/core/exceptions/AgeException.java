package org.example.java.core.exceptions;

/**
 * 自定义异常
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 15:19
 * @since JDK17
 */
public class AgeException extends RuntimeException {

	public AgeException() {
		super("年龄不符合条件");
	}

	public AgeException(String message) {
		super(message);
	}

}
