package factorymethodpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 定义工厂方法所创建的对象的接口
 */
public interface Product {
    void fun();
}

/**
 * 具体产品，实现Product接口
 */
class ConcreteProductA implements Product
{
    @Override
    public void fun() {
        System.out.println("make ConcreteProductA ");
    }
}

class ConcreteProductB implements Product
{

    @Override
    public void fun() {
        System.out.println("make ConcreteProductB ");
    }
}
