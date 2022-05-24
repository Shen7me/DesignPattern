package mediatorpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public abstract class Colleague {

    protected Mediator mediator;

    //构造方法，得到中介者对象
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void sendMsg(String message);

    public abstract void notifyMsg(String message);

}


class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMsg(String message) {
        mediator.send(message, this);
    }

    @Override
    public void notifyMsg(String message) {
        System.out.println("同事1得到消息：" + message);
    }

}

class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMsg(String message) {
        mediator.send(message, this);
    }

    @Override
    public void notifyMsg(String message) {
        System.out.println("同事2得到消息：" + message);
    }

}