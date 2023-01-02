package org.example.java.core.lambda4;

import org.example.java.core.lambda.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 断言型接口测试
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 13:26
 * @since JDK17
 */
public class PredicateTest {
	public static void main(String[] args) {
		List<Hero> list = new ArrayList<>();
		list.add(new Hero("亚瑟", "战士", 10000));
		list.add(new Hero("项羽", "坦克", 14000));
		list.add(new Hero("露娜", "打野", 7000));
		list.add(new Hero("鲁班七号", "射手", 5000));

		List<Hero> heroes = filterBlood(list, (hero -> hero.getBlood() >= 10000));
		System.out.println(heroes);

	}

	private static List<Hero> filterBlood(List<Hero> list, Predicate<Hero> predicate) {
		List<Hero> newList = new ArrayList<>();
		for (Hero hero : list) {
			boolean b = predicate.test(hero);
			if (b) {
				newList.add(hero);
			}
		}
		return newList;
	}
}
