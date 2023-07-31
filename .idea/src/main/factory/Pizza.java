package main.factory;

/**
 * ClassName: Pizza
 * Description:
 * Author: yangxianggang
 * Date: 2023/7/31 14:44
 * History:
 * <author>            <time>          <version>          <desc>
 * yangxianggang       修改时间            1.0              制作披萨的方法
 */
public class Pizza {

    private String pizzaName;

    public void prepare(){
        System.out.println(pizzaName+"披萨准备阶段。。。。。");
    }
    public void bake(){
        System.out.println(pizzaName+"披萨烤阶段。。。。。");
    }
    public void cut(){
        System.out.println(pizzaName+"披萨减少阶段。。。。。");
    }
    public void box(){
        System.out.println(pizzaName+"装盒阶段。。。。。");
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }
}