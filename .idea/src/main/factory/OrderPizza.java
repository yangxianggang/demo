package main.factory;

import java.util.Scanner;

/**
 * ClassName: OrderPizza
 * Description:
 * Author: yangxianggang
 * Date: 2023/7/31 15:06
 * History:
 * <author>            <time>          <version>          <desc>
 * yangxianggang       修改时间            1.0               描述
 */
public class OrderPizza {
    public static void main(String[] args) {
        do {
            System.out.println("开始制作，输入披萨类型");
            Scanner src = new Scanner(System.in);
            String next = src.next();

            Pizza pizza = null;
            if (next.equals("1")) {
                pizza = new CheessPizza();
                pizza.setPizzaName("奶酪");
            } else if (next.equals("2")) {
                pizza = new ChinaPizza();
                pizza.setPizzaName("中国");
            } else {
                pizza = new GreekPizza();
                pizza.setPizzaName("希腊");
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
            System.out.println("继续吗（y/n）");
            String next1 = src.next();
            if (!next1.equals("y")) {
                break;
            }

        } while (true);

        System.out.println("程序结束");
    }
}