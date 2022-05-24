package mediatorpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

//联合国机构   (Mediator)
public abstract class UnitedNations {
    //声明
    public abstract void declare(String msg,Country colleague);
}

//联合国安理会     (ConcreteMediator)
class UnitedNationsSecurityCouncil extends UnitedNations{

    private USA colleague1;
    private Iraq colleaque2;
    //美国
    public void setColeague1(USA coleague1) {
        this.colleague1 = coleague1;
    }
    //伊拉克
    public void setColleaque2(Iraq colleaque2) {
        this.colleaque2 = colleaque2;
    }

    @Override
    public void declare(String msg, Country colleague) {
        if(colleague==colleague1)
        {
            colleaque2.getMsg(msg);
        }
        else
        {
            colleague1.getMsg(msg);
        }
    }
}

