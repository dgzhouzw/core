package org.example.java.core.lambda4;

import java.util.function.Consumer;

/**
 * Consumer函数式接口
 * 定义一个功能，客户预计消费1000元。每一个客户，拿到1000元钱，消费不同
 * 客户1：花1000元，买了游戏装备
 * 客户2：花了1000元，买了衣服
 * 客户3：花了1000元，买了食品
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 12:27
 * @since JDK17
 */
public class ConsumerTest {
	public static void main(String[] args) {
		testConsumer();
	}

	private static void testConsumer() {
		Consumer<Integer> c1 = money -> System.out.println("客户花了" + money + "元，买了游戏装备");
		buy(1000, c1);
		Consumer<Integer> c2 = money -> System.out.println("客户花了" + money + "元，买了衣服");
		buy(1000, c2);
		Consumer<Integer> c3 = money -> System.out.println("客户花了" + money + "元，买了食品");
		buy(1000, c3);
	}

	private static void buy(int money, Consumer<Integer> consumer) {
		consumer.accept(money);
	}


}
