package builderpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 具体建造者类
 * 炒面 上面人说了得四个步骤！
 */
public class ChaoMian extends Cook {
    private Lunch lunch = new Lunch();

    @Override
    public void step1() {
        lunch.add("加油");
    }

    @Override
    public void step2() {
        lunch.add("加菜");
    }

    @Override
    public void step3() {
        lunch.add("加面");
    }

    @Override
    public void step4() {
        lunch.add("加盐");
    }

    @Override
    public Lunch getResult() {
        return lunch;
    }
}
