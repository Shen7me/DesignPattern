package abstractfactorypattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public abstract class AbstractProductB {
    abstract void fun();
}

class ProductB1 extends AbstractProductB
{

    @Override
    public void fun() {
        System.out.println("ConcreteProductB1 fun()");
    }
}

class ProductB2 extends AbstractProductB
{

    @Override
    public void fun() {
        System.out.println("ConcreteProductB2 fun()");
    }
}
