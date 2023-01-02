package org.example.java.core.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用Lambda表达式
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 11:04
 * @since JDK17
 */
public class HeroTest4 {
	public static void main(String[] args) {
		List<Hero> list = new ArrayList<>();
		list.add(new Hero("亚瑟", "战士", 10000));
		list.add(new Hero("项羽", "坦克", 14000));
		list.add(new Hero("露娜", "打野", 7000));
		list.add(new Hero("鲁班七号", "射手", 5000));

		//List<T> doFilter(List<T> list);
		List<Hero> heroes = filterHero(list, (list1) -> {
			List<Hero> newList = new ArrayList<>();

			for (Hero hero : list) {
				if ("坦克".equals(hero.getJob())) {
					newList.add(hero);
				}
			}
			return newList;
		});
		for (Hero hero : heroes) {
			System.out.println(hero);
		}

	}
	private static List<Hero> filterHero(List<Hero> list, FilterHero<Hero> filterHero) {
		return filterHero.doFilter(list);
	}

}
