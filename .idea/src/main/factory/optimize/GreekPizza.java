package main.factory.optimize;

/**
 * ClassName: GreekPizza
 * Description:
 * Author: yangxianggang
 * Date: 2023/7/31 14:59
 * History:
 * <author>            <time>          <version>          <desc>
 * yangxianggang       修改时间            1.0               希腊披萨
 */
public class GreekPizza extends Pizza {
    public void manufacture() {
         prepare();
        bake();
        cut();
        box();
    }
}