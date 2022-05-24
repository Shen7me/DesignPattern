package builderpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 具体建造者类
 * 炒饭 上面人说了得四个步骤！
 */
public class ChaoFan extends Cook {

    private Lunch lunch = new Lunch();

    @Override
    public void step1() {
        lunch.add("加油");
    }

    @Override
    public void step2() {
        lunch.add("加蛋");
    }

    @Override
    public void step3() {
        lunch.add("加米");
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