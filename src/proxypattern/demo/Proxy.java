package proxypattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class Proxy implements GiveGift{
    Pursuit gg;  //主要对象

    //gg送mm，让代理送
    public Proxy(SchoolGirl mm)
    {
        gg=new Pursuit(mm);
    }

    //代理的代码，显示的是哥哥送的；
    public void GiveDolls()
    {
        gg.GiveDolls();
    }
    public void GiveFlowers()
    {
        gg.GiveFlowers();
    }
    public void GiveChocolate()
    {
        gg.GiveChocolate();
    }

}
