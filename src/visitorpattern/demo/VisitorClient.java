package visitorpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class VisitorClient {
    public static void main(String[] args) {
        //在对象结构中加入要对比的”男人“和”女人“
        ObjectStructure o= new ObjectStructure();
        o.attach(new Man());
        o.attach(new Woman());

        //成功反应
        Success s=new Success();
        o.display(s);
        //失败
        Failing f=new Failing();
        o.display(f);
        //恋爱
        Loving l=new Loving();
        o.display(l);
    }
}
