package factorymethodpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public interface AbstractFactory {
    Hum makeHum();
}

class MDFactory implements AbstractFactory{
    @Override
    public Hum makeHum() {
        return new HumA ();
    }
}

class KFCFactory implements AbstractFactory{
    @Override
    public Hum makeHum() {
        return new HumB ();
    }
}

