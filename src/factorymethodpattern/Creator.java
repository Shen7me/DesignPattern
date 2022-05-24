package factorymethodpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public interface Creator {
    Product factoryMethod();
}

class ConcereteCreatorA implements Creator
{

    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}


class ConcereteCreatorB implements Creator
{

    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}