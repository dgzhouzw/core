package org.example.java.core.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现过滤接口的英雄工作类
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 10:39
 * @since JDK17
 */
public class FilterHeroByJob implements FilterHero<Hero> {

	@Override
	public List<Hero> doFilter(List<Hero> list) {
		List<Hero> newList = new ArrayList<>();

		for (Hero hero : list) {
			if ("坦克".equals(hero.getJob())) {
				newList.add(hero);
			}
		}
		return newList;
	}

}
