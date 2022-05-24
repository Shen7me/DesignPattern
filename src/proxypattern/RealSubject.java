package proxypattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * RealSubject，真实实体类，定义代理所代表的真实实体。
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("真实的请求");
    }

}