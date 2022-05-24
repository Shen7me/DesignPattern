package bridgepattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class BridgeClient {
    public static void main(String[] args) {
        RefinedCar ag=new ACar(new GasolineEngine());
        RefinedCar ae=new ACar(new ElectricEngine());
        RefinedCar bg=new BCar(new GasolineEngine());
        RefinedCar be=new BCar(new ElectricEngine());

        ag.drive();
        ae.drive();
        bg.drive();
        be.drive();
    }



}
