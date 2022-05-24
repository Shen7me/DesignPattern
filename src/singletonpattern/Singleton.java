package singletonpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

//懒汉式
public class Singleton {
    private static Singleton instance;
    //私有化构造方法，堵死new创建单例
    private Singleton(){}

    //此方法是获得本类实例唯一全局访问点
    public static Singleton getInstance()
    {
        //若实力不存在，则new个新的，存在就返回已有的
        if(instance==null)
        {
            instance=new Singleton();
        }
        return instance;
    }

    void fun(){
        System.out.println(instance.toString());
    }
}
