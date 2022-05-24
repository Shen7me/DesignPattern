package proxypattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public interface GiveGift {
    //实体类和代理类共有的功能；送洋娃娃送花送巧克力；
    void GiveDolls();
    void GiveFlowers();
    void GiveChocolate();
}
