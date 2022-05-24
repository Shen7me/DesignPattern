package flyweightpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 所有具体享元类的超类，通过此接口，Flyweight可以接受并作用于外部状态
 */
public abstract class Flyweight {
    public abstract void operation(int extrinsicState);
}

/**
 * 继承Flyweight或实现Flyweight接口，并为内部状态增加存储空间
 */
class ConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int extrinsicState) {
        System.out.println("具体Flyweight：" + extrinsicState);
    }

}

/**
 * 指那些不需要共享的Flyweight子类，因为接口共享成为可能，但它并不强制共享。
 */
class UnsharedConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int extrinsicState) {
        System.out.println("不共享的具体Flyweight：" + extrinsicState);
    }

}
