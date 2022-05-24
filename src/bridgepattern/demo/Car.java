package bridgepattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

//抽象类
public abstract class Car {
    protected Engine engine;
    public Car(Engine engine)
    {
        this.engine=engine;
    }

    public abstract void drive();
}
//修正抽象类，增加一些功能
abstract class RefinedCar extends Car{

    public RefinedCar(Engine engine) {
        super(engine);
    }

    public abstract String getBrand();

    public void drive()
    {
        this.engine.start();
        System.out.println("开"+getBrand()+"车");
    }
}

class BCar extends RefinedCar {
    public BCar(Engine engine) {
        super(engine);
    }

    public String getBrand() {
        return "B";
    }
}

class ACar extends RefinedCar {
    public ACar(Engine engine) {
        super(engine);
    }

    public String getBrand() {
        return "A";
    }
}

