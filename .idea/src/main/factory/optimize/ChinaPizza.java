package main.factory.optimize;

/**
 * ClassName: ChinaPizza
 * Description:
 * Author: yangxianggang
 * Date: 2023/7/31 15:03
 * History:
 * <author>            <time>          <version>          <desc>
 * yangxianggang       修改时间            1.0               描述
 */
public class ChinaPizza extends Pizza {
     public   void  manufacture(){

        prepare();
        bake();
        cut();
        box();
    }


}