package abstractfactorypattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class AbFaClient {
    public static void main(String[] args) {
        //获取工厂1
        AbstractFactory af1=new ConcreteFactory1();
        //获取工厂1的A产品
        AbstractProductA pa1=af1.createProductA();
        //调用该产品的方法
        pa1.fun();
        //获取工厂1的B产品
        AbstractProductB pb1=af1.createProductB();
        //调用该产品的方法
        pb1.fun();

        //获取工厂2
        AbstractFactory af2=new ConcreteFactory2();
        //获取工厂2的A产品
        AbstractProductA pa2=af2.createProductA();
        //调用该产品的方法
        pa2.fun();
        //获取工厂2的B产品
        AbstractProductB pb2=af2.createProductB();
        //调用该产品的方法
        pb2.fun();

    }

}
