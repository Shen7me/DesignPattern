package strategypattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * Strategy类，定义所有支持的算法的公共接口
 */
//创建接口
public interface Strategy{
    //算法方法
    public void algorithmInterface();
}

/**
 * ConcreteStrategy类封装了具体的算法或行为，实现了Strategy接口
 */
//具体算法A
class ConcreteStrategyA implements Strategy{
    @Override
    public void algorithmInterface()
    {
        System.out.println("算法A实现");
    }
}

//具体算法B
class ConcreteStrategyB implements Strategy{
    @Override
    public void algorithmInterface()
    {
        System.out.println("算法B实现");
    }
}

//具体算法C
class ConcreteStrategyC implements Strategy{
    @Override
    public void algorithmInterface()
    {
        System.out.println("算法C实现");
    }
}