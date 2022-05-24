package chainOfResponsibility.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public abstract class Manager {
    protected String name;
    //管理者的上层，请求传递的下一层
    protected Manager superior;

    public Manager(String name)
    {
        this.name=name;
    }

    //设置管理者的上级
    public void setSuperior(Manager superior)
    {
        this.superior=superior;
    }
    //
    abstract public void requestApplication(Request request);
}
//经理
class CommonManager extends Manager
{

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {

        if(request.getRequestType()=="请假"&&request.getNumber()<=2)
        {
            //经理只能给两天假
            System.out.println(name+":"+request.getRequestContent()+"数量"+request.getNumber()+"被批准");
        }
        else
        {
            //其余转到上级
            if(superior!=null)
                superior.requestApplication(request);
        }

    }
}

//总监
class Majordomo extends Manager
{

    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {

        if(request.getRequestType()=="请假"&&request.getNumber()<=5)
        {
            //经理只能给一周假
            System.out.println(name+":"+request.getRequestContent()+"数量"+request.getNumber()+"被批准");
        }
        else
        {
            //其余转到上级
            if(superior!=null)
                superior.requestApplication(request);
        }

    }
}

//总经理
class GeneralManager extends Manager
{

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {

        if(request.getRequestType()=="请假"&&request.getNumber()<=5)
        {
            //经理只能给一周假
            System.out.println(name+":"+request.getRequestContent()+"数量"+request.getNumber()+"被批准");
        }
        else if (request.getRequestType()=="加薪"&&request.getNumber()<=500) {
            //加薪500内可以
            System.out.println(name+":"+request.getRequestContent()+"数量"+request.getNumber()+"被批准");
        }
        else if(request.getRequestType()=="加薪"&& request.getNumber()>500)
        {
            System.out.println(name+":"+request.getRequestContent()+"数量"+request.getNumber()+"不行");
        }
    }
}