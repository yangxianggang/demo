package main.factory.optimize;

/**
 * ClassName: SimpleFactory
 * Description:
 * Author: yangxianggang
 * Date: 2023/7/31 17:11
 * History:
 * <author>            <time>          <version>          <desc>
 * yangxianggang       修改时间            1.0               描述
 */
public class SimpleFactory {

     //使用orderType判断
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        if (orderType.equals("1")) {
            pizza = new CheessPizza();
            pizza.setPizzaName("奶酪");
        } else if (orderType.equals("2")) {
            pizza = new ChinaPizza();
            pizza.setPizzaName("中国");
        } else {
            pizza = new GreekPizza();
            pizza.setPizzaName("希腊");
        }
        return pizza;
    }
    //简单工厂模式，也叫静态工厂模式

    public static Pizza createPizza2(String orderType){
        Pizza pizza = null;
        if (orderType.equals("1")) {
            pizza = new CheessPizza();
            pizza.setPizzaName("奶酪");
        } else if (orderType.equals("2")) {
            pizza = new ChinaPizza();
            pizza.setPizzaName("中国");
        } else {
            pizza = new GreekPizza();
            pizza.setPizzaName("希腊");
        }
        return pizza;
    }
}