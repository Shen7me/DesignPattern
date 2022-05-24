package singletonpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

//饿汉式，即静态初始化的方式，在加载时就初始化
public class SingletonHungry {
    private static SingletonHungry instance = new SingletonHungry();
    private SingletonHungry (){}
    public static SingletonHungry getInstance() {
        return instance;
    }

    void fun(){
        System.out.println(instance.toString());
    }
}
