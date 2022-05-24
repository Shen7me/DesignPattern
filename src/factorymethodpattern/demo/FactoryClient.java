package factorymethodpattern.demo;


/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class FactoryClient {
    public static void main(String[] args) {
        //按照UML思路 KFC产HumA
        AbstractFactory fa =new KFCFactory();
        Hum ha= fa.makeHum();
        ha.make();

        //按照UML思路 MD产HumB
        AbstractFactory fb =new MDFactory();
        Hum hb= fb.makeHum();
        hb.make();
    }
}
