package proxypattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class Pursuit implements GiveGift {
    //创建目标对象，代理的操作没有目标的话 也就不需要了
    //这里看见是追求者——>mm;
    //使用大力模式，mm只能知道代理，而看不见追求者
    SchoolGirl mm;
    public Pursuit(SchoolGirl mm)
    {
        this.mm=mm;
    }

    public void GiveDolls()
    {
        System.out.println("给"+mm.getName()+"送洋娃娃");
    }
    public void GiveFlowers()
    {
        System.out.println("给"+mm.getName()+"送花");
    }
    public void GiveChocolate()
    {
        System.out.println("给"+mm.getName()+"送巧克力");
    }

}
