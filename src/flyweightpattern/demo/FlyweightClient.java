package flyweightpattern.demo;
/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class FlyweightClient {

    public static void main(String[] args) {
        WebSiteFactory f = new WebSiteFactory();

        WebSite w1=f.getWebSiteType("电子商务");
        w1.use(new User("张三","卖鞋"));

        WebSite w2=f.getWebSiteType("电子商务");
        w2.use(new User("李四","卖酒"));

        WebSite w3=f.getWebSiteType("博客");
        w3.use(new User("王五","写技术"));

        WebSite w4=f.getWebSiteType("博客");
        w4.use(new User("赵六","放写真"));

        UnshareConcreteWebSite w5 =new UnshareConcreteWebSite();
        w5.use(new User("刘七","不可告人"));
    }


}
