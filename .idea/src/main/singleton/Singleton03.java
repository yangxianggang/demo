package main.singleton;

/**
 * ClassName: Singleton03
 * Description:
 * Author: yangxianggang
 * Date: 2023/7/31 10:41
 * History:
 * <author>            <time>          <version>          <desc>
 * yangxianggang       修改时间            1.0            单列模式：懒汉式 线程不安全
 */
public class Singleton03 {
    public static void main(String[] args) {
        Singleton003 instance = Singleton003.getInstance();
        Singleton003 instance1 = Singleton003.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode() + "----" + instance1.hashCode());

    }
}

class Singleton003{
    private static Singleton003 singleton003;

    private Singleton003(){}

    public static Singleton003 getInstance(){
        if (null==singleton003){
            singleton003=new Singleton003();
        }
        return singleton003;
    }
}