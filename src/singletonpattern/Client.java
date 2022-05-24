package singletonpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class Client {
    public static void main(String[] args) {
        //Singleton
        Singleton singleton=Singleton.getInstance();
        singleton.fun();
        Singleton singleton2=Singleton.getInstance();
        singleton2.fun();
        //SingletonThreadSafe
        SingletonThreadSafe.getInstance().fun();
        //SingletonHungry
        SingletonHungry.getInstance().fun();
        //SingletonEnum
        SingletonEnum.INSTANCE.fun();

    }


}
