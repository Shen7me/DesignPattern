package abstractfactorypattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 抽象工厂接口，它里面应该包含所有产品创建的抽象方法
 */
public abstract class AbstractFactory {
    abstract AbstractProductA createProductA();
    abstract AbstractProductB createProductB();
}

/**
 * 具体工厂，创建具有特定实现的产品对象
 */
class ConcreteFactory1 extends AbstractFactory
{

    @Override
    AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB1();
    }
}

class ConcreteFactory2 extends AbstractFactory
{

    @Override
    AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB2();
    }
}