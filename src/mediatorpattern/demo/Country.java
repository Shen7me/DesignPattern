package mediatorpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

//国家        (Colleague)
public class Country {
    protected UnitedNations mediator;
    public Country(UnitedNations mediator)
    {
        this.mediator=mediator;
    }
}


//美国   (ConcreteColleague1)
class USA extends Country {

    public USA(UnitedNations mediator) {
        super(mediator);
    }

    //声明
    public void declare(String msg)
    {
        mediator.declare(msg,this);
    }

    //获得消息
    public void getMsg(String msg)
    {
        System.out.println("美国获得对方消息："+msg);
    }
}



//伊拉克   (ConcreteColleague2)
class Iraq extends Country {

    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    //声明
    public void declare(String msg)
    {
        mediator.declare(msg,this);
    }

    //获得消息
    public void getMsg(String msg)
    {
        System.out.println("伊拉克获得对方消息："+msg);
    }
}