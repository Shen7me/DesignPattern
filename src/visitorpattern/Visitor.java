package visitorpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 为该对象结构中ConcreteElement的每一个类声明一个Visit操作
 */
public abstract class Visitor {
    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);

    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}

/**
 * 具体访问者，实现每个由Visitor生命的操作。每个操作实现算法一部分，而该算法片段乃是对应于结构中对象的类。
 */
class ConcreteVisitor1 extends Visitor {

    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + "被"
                + this.getClass().getSimpleName() + "访问");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName() + "被"
                + this.getClass().getSimpleName() + "访问");
    }

}

class ConcreteVisitor2 extends Visitor {

    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + "被"
                + this.getClass().getSimpleName() + "访问");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName() + "被"
                + this.getClass().getSimpleName() + "访问");
    }

}