package simplefactory;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class Client {
    public static void main(String[] args) {
        Procudt p=null;
        p=Factory.createProcudt('A');
        p.used();
        p=Factory.createProcudt('B');
        p.used();
    }
}
