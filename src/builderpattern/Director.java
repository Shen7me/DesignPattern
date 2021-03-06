package builderpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 指挥者类，用来指挥建造过程
 */
public class Director {
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
