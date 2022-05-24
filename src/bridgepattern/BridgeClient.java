package bridgepattern;
/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class BridgeClient {
    public static void main(String[] args) {
        //这样多个扩充抽象类和多个具体实现类，能够复杂的混合在一起
        //多角度的分类每一种都有变化的系统，将多角度分类抽象出来，减少他们的耦合

        Abstraction a = new AbstractionA("A");
        a.setImplementor(new ConcreteImplemtorA());
        a.operation();
        a.setImplementor(new ConcreteImplemtorB());
        a.operation();

        Abstraction b = new AbstractionB("B");
        b.setImplementor(new ConcreteImplemtorA());
        b.operation();
        b.setImplementor(new ConcreteImplemtorB());
        b.operation();
    }
}
