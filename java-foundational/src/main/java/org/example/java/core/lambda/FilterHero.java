package org.example.java.core.lambda;

import java.util.List;

/**
 * 过滤接口
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 10:38
 * @since JDK17
 */
public interface FilterHero<T> {

	List<T> doFilter(List<T> list);
}
