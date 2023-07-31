package main.singleton;

/**
 * ClassName: Singleton06
 * Description:
 * Author: yangxianggang
 * Date: 2023/7/31 11:22
 * History:
 * <author>            <time>          <version>          <desc>
 * yangxianggang       修改时间            1.0               单列模式：静态内部类完成
 */
public class Singleton06 {
}


/**
 * 静态内部类完成 推荐使用
 */
class Singleton006{
    private Singleton006(){}

    private static class SingletonInstance{
        private static final Singleton006 INSTANCE=new Singleton006();
    }


    public static synchronized Singleton006 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}