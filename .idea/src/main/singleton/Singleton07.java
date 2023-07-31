package main.singleton;

/**
 * ClassName: Singleton07
 * Description:
 * Author: yangxianggang
 * Date: 2023/7/31 11:29
 * History:
 * <author>            <time>          <version>          <desc>
 * yangxianggang       修改时间            1.0           单例模式：枚举
 */
public class Singleton07 {
    public static void main(String[] args) {
        Singleton007 instance = Singleton007.INSTANCE;
        Singleton007 instance1 = Singleton007.INSTANCE;
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode() + "--" + instance1.hashCode());
        instance.sayOK();
    }
}

enum  Singleton007{
    INSTANCE;
    public  void sayOK(){
        System.out.println("OK~");

    }
}