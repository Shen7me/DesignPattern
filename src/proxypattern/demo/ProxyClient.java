package proxypattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class ProxyClient {
    public static void main(String[] args) {
        SchoolGirl jiaojiao=new SchoolGirl();
        jiaojiao.setName("李娇娇");

        //代理——>娇娇
        Proxy proxy=new Proxy(jiaojiao);

        //代理调用方法，代理类中方法是  gg.GiveDolls()
        proxy.GiveDolls();
        proxy.GiveFlowers();
        proxy.GiveChocolate();
    }
}
