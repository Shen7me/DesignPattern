package adapterpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class AdapterClient {
    public static void main(String[] args) {
        Target target;

        target = new Adapter();
        //客户端只管调用target的request()
        //然后实际是用Adptee实现的方法
        target.request();
    }
}
