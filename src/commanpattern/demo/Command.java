package commanpattern.demo;


/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 抽象命令类，只需要确定“烤肉串者”是谁
 */
public abstract class Command {
    protected Barbecuer reciever;

    public Command(Barbecuer reciever) {
        this.reciever = reciever;
    }

    public abstract void executeCommand();

    @Override
    public abstract String toString();
}

//烤羊肉串命令      具体命令类
class BakeMuttonCommand extends Command{

    public BakeMuttonCommand(Barbecuer reciever) {
        super(reciever);
    }

    @Override
    public void executeCommand() {
        reciever.bakeMutton();
    }

    @Override
    public String toString() {
        return "一个羊肉";
    }
}

//烤鸡肉命令      具体命令类
class BakeChickenCommand extends Command{

    public BakeChickenCommand(Barbecuer reciever) {
        super(reciever);
    }

    @Override
    public void executeCommand() {
        reciever.bakeChicken();
    }

    @Override
    public String toString() {
        return "一个鸡肉";
    }
}