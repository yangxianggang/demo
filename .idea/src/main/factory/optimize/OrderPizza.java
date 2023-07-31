package main.factory.optimize;

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

    SimpleFactory simpleFactory;
    Pizza pizza=null;

    public OrderPizza(SimpleFactory simpleFactory){
        this.setOrderPizza(simpleFactory);
    }

    public static void main(String[] args) {
        OrderPizza orderPizza=new OrderPizza(simpleFactory);

    }

    public void setOrderPizza(SimpleFactory simpleFactory){

        String orderType="";
        this.simpleFactory=simpleFactory;
        do {
            orderType = getOrderType();
            Pizza factoryPizza = this.simpleFactory.createPizza(orderType);
            if (factoryPizza!=null){
                factoryPizza.prepare();
                factoryPizza.bake();
                factoryPizza.cut();
                factoryPizza.box();

            }else {
                System.out.println("订购失败。。。");
                break;
            }


        }while (true);

    }

    public static String getOrderType(){
        System.out.println("开始制作，输入披萨类型");
        Scanner src = new Scanner(System.in);
      return src.next();
    }
}