package proxypattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class ProxyClient {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
