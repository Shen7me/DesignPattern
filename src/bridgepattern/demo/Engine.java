package bridgepattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public interface Engine {
    void start();
}

class GasolineEngine implements Engine {
    public void start() {
        System.out.print("Start Gasoline Engine...");
    }
}


class ElectricEngine implements Engine {
    public void start() {
        System.out.print("Start Electric Engine...");
    }
}
