package facadepattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class FacadeClient {

    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.methodA();
        facade.methodB();
    }
}
