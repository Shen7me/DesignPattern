package adapterpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 需要适配的类
 */
public class Adaptee {
    public void specificRequest() {
        System.out.println("特殊的请求！");
    }
}
