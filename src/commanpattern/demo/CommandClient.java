package commanpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class CommandClient {
    public static void main(String[] args) {
        //一个烤肉者   (Reciever)接收者
        Barbecuer b=new Barbecuer();
        //一个服务员    (Invoker)调用者
        Waiter w=new Waiter();

        //顾客点菜
        Command bakeMuttonCommand1=new BakeMuttonCommand(b);
        Command bakeMuttonCommand2=new BakeMuttonCommand(b);
        Command bakeChickenCommand1=new BakeChickenCommand(b);

        w.setOrder(bakeMuttonCommand1);
        w.setOrder(bakeMuttonCommand2);
        w.setOrder(bakeChickenCommand1);

        //点菜完毕,Invoker去通知Reciever做事情
        w.notifyCommand();
    }

}
