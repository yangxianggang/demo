package main.singleton;

/**
 * ClassName: Singleton02
 * Description:
 * Author: yangxianggang
 * Date: 2023/7/31 10:34
 * History:
 * <author>            <time>          <version>          <desc>
 * yangxianggang       修改时间            1.0        单列模式：饿汉式（静态代码块）
 */
public class Singleton02 {
    public static void main(String[] args) {
        Singleton002 singleton = Singleton002.getSingleton();
        Singleton002 singleton1 = Singleton002.getSingleton();

        System.out.println(singleton1 == singleton);

        System.out.println(singleton.hashCode() + "----" + singleton1.hashCode());

    }
}

class Singleton002{
    private static Singleton002 singleton;
    //构造器私有化，防止对象被new
    private Singleton002(){}

    static {
        singleton=new Singleton002();
    }
    public static Singleton002 getSingleton(){
        return singleton;
    }
}