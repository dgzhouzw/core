package org.example.java.core.exceptions;

import javax.naming.Name;

/**
 * 自定义运行时异常
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 15:23
 * @since JDK17
 */
public class NameException extends Exception {

	public NameException() {

	}

	public NameException(String message) {
		super(message);
	}

}
