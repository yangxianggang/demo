package main.singleton;

/**
 * ClassName: Singleton05
 * Description:
 * Author: yangxianggang
 * Date: 2023/7/31 11:16
 * History:
 * <author>            <time>          <version>          <desc>
 * yangxianggang       修改时间            1.0            单列模式:双重检查
 */
public class Singleton05 {
    public static void main(String[] args) {
        Singleton005 instance = Singleton005.getInstance();
        Singleton005 instance1 = Singleton005.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode() + "--" + instance1.hashCode());

    }
}
class Singleton005{
    private Singleton005(){}

    private static volatile Singleton005 singleton005;



    //双重 synchronized 校验 解决线程安全问题 同时解决 懒加载问题
    public static synchronized Singleton005 getInstance(){
        if (singleton005==null){
            synchronized (Singleton005.class){
                if (singleton005==null){
                    singleton005=new Singleton005();
                }
            }
        }
        return singleton005;
    }
}