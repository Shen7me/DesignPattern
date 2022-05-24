package decoratorpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 装饰模式客户端，层层包装，用前面的对象装饰后面的对象
 */
public class DecoratorClient {
    public static void main(String[] args) {
        ConcreteComponent cc = new ConcreteComponent();
        ConcreteDecoratorA cda = new ConcreteDecoratorA();
        ConcreteDecoratorB cdb = new ConcreteDecoratorB();
        ConcreteDecoratorC cdc = new ConcreteDecoratorC();

        cda.setComponent(cc);
        cdb.setComponent(cda);
        cdc.setComponent(cdb);
        cdc.operation();
    }
}
