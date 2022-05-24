package decoratorpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 人穿衣服，人是Component，衣服是Decorator。当我们只有一个具体的对象时，可以将Component
 * 与ConcreteComponent合并为一个类。同样的，当只有一个ConcreteDecorator，可以把
 * Decorator和ConcreteDecorator合并成一个类。那么下面就没有Component类，直接让Decorator继承ConcreteComponent即可。
 */
public class DecoratorClient {
    public static void main(String[] args) {
        Person p=new Person("海鸥乙");
        TShirts tShirts=new TShirts();
        BigTrouser bigTrouser =new BigTrouser();

        tShirts.beBeautiful(p);
        bigTrouser.beBeautiful(tShirts);
        bigTrouser.show();

        XZ xz=new XZ();
        Tie tie =new Tie();

        xz.beBeautiful(p);
        tie.beBeautiful(xz);
        tie.show();
    }


}
