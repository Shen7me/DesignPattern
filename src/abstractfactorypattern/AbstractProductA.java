package abstractfactorypattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 定义工厂方法所创建的对象的接口
 */
public abstract class AbstractProductA {
    abstract void fun();
}

/**
 * 具体产品，实现AbstractProductA
 */
class ProductA1 extends AbstractProductA
{
    @Override
    public void fun() {
        System.out.println("ConcreteProductA1 fun()");
    }
}
class ProductA2 extends AbstractProductA
{
    @Override
    public void fun() {
        System.out.println("ConcreteProductA2 fun()");
    }
}



