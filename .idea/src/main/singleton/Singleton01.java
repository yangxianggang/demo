package main.singleton;

/**
 * ClassName: SingLeton01
 * Description:
 * Author: yangxianggang
 * Date: 2023/7/31 10:03
 * History:
 * <author>            <time>          <version>          <desc>
 * yangxianggang       修改时间            1.0        单列模式：饿汉式（静态常量）
 */
public class Singleton01 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton == singleton1);
        System.out.println("singleton hashCode=" + singleton.hashCode());
        System.out.println("singleton1 hashCode=" + singleton.hashCode());

    }
}
class Singleton {
    //使用构造器私有化，防止对象被new
    private Singleton() {
    }

    private static final Singleton singleton = new Singleton();

    //对外提供一个静态方法
    public static Singleton getSingleton() {
        return singleton;
    }


}