package singletonpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

//懒汉式 单例最优写法
public class SingletonThreadSafe {
    //volatile 轻量级锁
    private static volatile SingletonThreadSafe instance;

    private SingletonThreadSafe() { }

    public static SingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new SingletonThreadSafe();
                }
            }
        }

        return instance;
    }

    void fun(){
        System.out.println(instance.toString());
    }


}
