package singletonpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
//被认为是实现单例模式的最佳方法
public enum SingletonEnum {
    INSTANCE; //单个枚举
    void fun(){
        System.out.println(INSTANCE.toString());
    }
}
