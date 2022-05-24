package visitorpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 定义一个Accept操作，它以一个访问者为参数
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}

/**
 * 具体类，实现Accept操作
 */
class ConcreteElementA extends Element {

    //利用双分派技术，实现处理与数据结构的分离
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
    //其他方法
    public void operationA(){}

}

class ConcreteElementB extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    //其他方法
    public void operationB(){}
}
