package proxypattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 定义 RealSubject（实体类）和Proxy（代理类）的共用接口，这样就能在使用RealSubject的地方都是用Proxy。
 */
public interface Subject {
    public void request();
}