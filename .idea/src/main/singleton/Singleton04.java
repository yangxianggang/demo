package main.singleton;

/**
 * ClassName: Singleton03
 * Description:
 * Author: yangxianggang
 * Date: 2023/7/31 10:41
 * History:
 * <author>            <time>          <version>          <desc>
 * yangxianggang       修改时间            1.0            单列模式：懒汉式 线程安全 加入synchronized
 */
public class Singleton04 {
    public static void main(String[] args) {
        Singleton004 instance = Singleton004.getInstance();
        Singleton004 instance1 = Singleton004.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode() + "----" + instance1.hashCode());

    }
}

class Singleton004{
    private static Singleton004 singleton004;

    private Singleton004(){}

    public static synchronized Singleton004 getInstance(){
        if (null==singleton004){
            singleton004=new Singleton004();
        }
        return singleton004;
    }
}