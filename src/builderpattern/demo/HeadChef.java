package builderpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 指挥者类，用来指挥建造过程
 * 主厨说做饭需要4步
 */
public class HeadChef {
    public void construct(Cook cook) {
        cook.step1();
        cook.step2();
        cook.step3();
        cook.step4();
    }
}
