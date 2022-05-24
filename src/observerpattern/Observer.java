package observerpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 抽象观察者，为所有的具体观察者定义一个接口，在得到主题的通知时
 * 更新自己。这个接口叫做更新接口。抽象观察者一般用一个抽象类或者
 * 一个接口实现。更新接口通常包括Update（）方法，这个方法叫做更新方法。
 */
public abstract class Observer {
    //更新方法
    public abstract void update();
}