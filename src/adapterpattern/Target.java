package adapterpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 用户期待的接口，可以是接口，可以是抽象类
 */
public abstract class Target {
    public void request() {
        System.out.println("普通请求！");
    }
}
