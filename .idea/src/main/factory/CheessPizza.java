package main.factory;

/**
 * ClassName: CheessPizza
 * Description:
 * Author: yangxianggang
 * Date: 2023/7/31 14:51
 * History:
 * <author>            <time>          <version>          <desc>
 * yangxianggang       修改时间            1.0               奶酪披萨
 */
public class CheessPizza extends Pizza {
     public   void  manufacture(){
          prepare();
         bake();
         cut();
         box();
     }


}