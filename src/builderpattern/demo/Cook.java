package builderpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 抽象建造者类（Builder） 确定饭由四步部件组成，并声明一个得到产品建造后结果的方法GetResult
 * 声明做午饭必须4个步骤！！
 */
public abstract class Cook {
    public abstract void step1();
    public abstract void step2();
    public abstract void step3();
    public abstract void step4();

    public abstract Lunch getResult();
}
