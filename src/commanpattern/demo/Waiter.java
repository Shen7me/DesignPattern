package commanpattern.demo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * invoker调用者
 */
public class Waiter {
    private List<Command> orders = new ArrayList<>();
    //设置订单
    public void setOrder(Command command)
    {
        //这里一个判断条件，用来否决
        if (command.toString()=="asdasd")
        {
            System.out.println("鸡翅没有了");
        }
        else
        {
            orders.add(command);
            //日志
            System.out.println("增加订单："+command.toString()+"\t时间："+ Calendar.getInstance().getTime());
        }
    }

    //取消订单
    public void cancelOrder(Command command)
    {
        orders.remove(command);
        //日志
        System.out.println("取消订单："+command.toString()+"\t时间："+ Calendar.getInstance().getTime());
    }

    public void notifyCommand()
    {
        for(Command command : orders)
        {
            command.executeCommand();
        }
    }
}
