package builderpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 抽象建造者类确定产品由两个部件组成，并声明一个得到产品建造后结果的方法GetResult
 */
public abstract class Builder {
    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getResult();
}
