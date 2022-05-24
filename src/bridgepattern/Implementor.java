package bridgepattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
//这就是一个接口。。。
public abstract class Implementor {

    public abstract void operation();

}

class ConcreteImplemtorA extends Implementor {

    @Override
    public void operation() {
        System.out.println("ConcreteImplemtorA的方法执行");
    }

}

class ConcreteImplemtorB extends Implementor {

    @Override
    public void operation() {
        System.out.println("ConcreteImplemtorB的方法执行");
    }
}

