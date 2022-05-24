package bridgepattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public abstract class Abstraction {
    //Abstraction聚合Implementor
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}

//修正抽象类，扩充抽象类。定义一些额外操作。   然后具体类继承
abstract class RefineAbstraction extends Abstraction
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RefineAbstraction(String name) {
        this.setName(name);
    }


    @Override
    public void operation() {
        System.out.print("Abstraction-" + this.getName() + ": ");
        implementor.operation();
    }
}

//继承自修正抽象类
class AbstractionA extends RefineAbstraction {
    @Override
    public void operation() {
        super.operation();
    }

    ////
    public AbstractionA(String name) {
        super(name);
    }

}

//继承自修正抽象类
class AbstractionB extends RefineAbstraction {
    @Override
    public void operation() {
        super.operation();
    }

    ////
    public AbstractionB(String name) {
        super(name);
    }

}