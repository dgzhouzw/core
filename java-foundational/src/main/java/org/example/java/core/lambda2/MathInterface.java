package org.example.java.core.lambda2;

/**
 * 数字扩大10倍的接口
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 11:25
 * @since JDK17
 */
@FunctionalInterface
public interface MathInterface {

	Integer expand10(Integer i);

	default Integer abs(Integer i) {
		return Math.abs(i);
	}
}
