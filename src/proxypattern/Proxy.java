package proxypattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * Proxy类，保存一个引用使得代理可以访问实体，并提供一个与Subject的接口相同的接口，
 * 这样代理可以用来替代实体
 */
public class Proxy implements Subject{
    // 保存一个引用，使得代理可以访问真实实体
    Subject subject;

    public Proxy() {
        subject = new RealSubject();
    }

    @Override
    public void request() {
        subject.request();
    }
}
