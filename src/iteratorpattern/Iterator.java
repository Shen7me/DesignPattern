package iteratorpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

//定义接口也行
public abstract class Iterator {
    /**
     * 用于定义得到开始对象，得到下一个对象、判断是否到结尾、当前对象等抽象想方法，统一接口
     */
    public abstract Object first();

    public abstract Object next();

    public abstract boolean isDone();

    public abstract Object currentItem();
}
