package org.example.java.core.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * 英雄类测试
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 10:29
 * @since JDK17
 */
public class HeroTest {
	public static void main(String[] args) {
		List<Hero> list = new ArrayList<>();
		list.add(new Hero("亚瑟", "战士", 10000));
		list.add(new Hero("项羽", "坦克", 14000));
		list.add(new Hero("露娜", "打野", 7000));
		list.add(new Hero("鲁班七号", "射手", 5000));

		//List<Hero> heroes = filterJob(list);
		List<Hero> heroes = filterBlood(list);
		for (Hero hero : heroes) {
			System.out.println(hero);
		}
	}

	private static List<Hero> filterJob(List<Hero> list) {
		List<Hero> newList = new ArrayList<>();

		for (Hero hero : list) {
			if ("坦克".equals(hero.getJob())) {
				newList.add(hero);
			}
		}
		return newList;
	}

	private static List<Hero> filterBlood(List<Hero> list) {
		List<Hero> newList = new ArrayList<>();
		for (Hero hero : list) {
			if (hero.getBlood() >= 10000) {
				newList.add(hero);
			}
		}
		return newList;
	}
}
