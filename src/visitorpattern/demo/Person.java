package visitorpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
//元素类的
public abstract class Person {
    //接受
    public abstract void accept(Action visitor);//用来获得'状态'对象的
}

/**
 * 访问者模式的元素分类 是稳定的。那么这里只分为男人女人，这是重要的前提
 */
class Man extends Person
{

    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }
}

class Woman extends Person
{

    @Override
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }
}