package facadepattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * facade类，他需要知道所有子系统的类和方法，
 * 进行组合，
 * 方便外界调用
 */
public class Facade {
    SubSystemOne subSystemOne;
    SubSystemTwo subSystemTwo;
    SubSystemThree subSystemThree;
    SubSystemFour subSystemFour;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
        subSystemFour = new SubSystemFour();
    }

    public void methodA() {
        System.out.println("方法组A:");

        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
        subSystemFour.methodFour();
    }

    public void methodB() {
        System.out.println("方法组B:");

        subSystemThree.methodThree();
        subSystemFour.methodFour();
    }
}
