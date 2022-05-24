package simplefactory;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public abstract class Procudt {
    public abstract void used();
}

class ConcreteProductA extends Procudt
{

    @Override
    public void used() {
        System.out.println("use ConcreteProductA");
    }
}

class ConcreteProductB extends Procudt
{

    @Override
    public void used() {
        System.out.println("use ConcreteProductB");
    }
}