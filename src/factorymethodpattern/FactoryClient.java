package factorymethodpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class FactoryClient {
    public static void main(String[] args) {
        Creator ca=new ConcereteCreatorA();
        Product pa = ca.factoryMethod();
        pa.fun();

        Creator cb=new ConcereteCreatorB();
        Product pb = cb.factoryMethod();
        pb.fun();
    }
}
