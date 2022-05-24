package flyweightpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class FlyweightClient {
    public static void main(String[] args) {
        //外部状态 ，这里只有一个数，实际可做很多类啊 啥的
        int extrinsicState = 22;

        FlyweightFactory f = new FlyweightFactory();

        Flyweight fx = f.getFlyweight("X");
        fx.operation(--extrinsicState);

        Flyweight fy = f.getFlyweight("Y");
        fy.operation(--extrinsicState);

        Flyweight fz = f.getFlyweight("Z");
        fz.operation(--extrinsicState);

        Flyweight fa = f.getFlyweight("A");
        fz.operation(--extrinsicState);

        Flyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--extrinsicState);
    }
}
