package org.example.java.core.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现过滤接口的英雄血量类
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 10:41
 * @since JDK17
 */
public class FilterHeroByBlood implements FilterHero<Hero> {

	@Override
	public List<Hero> doFilter(List<Hero> list) {
		List<Hero> newList = new ArrayList<>();
		for (Hero hero : list) {
			if (hero.getBlood() >= 10000) {
				newList.add(hero);
			}
		}
		return newList;
	}
}
