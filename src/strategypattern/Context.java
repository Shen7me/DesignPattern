package strategypattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * Context，用一个ConcreteStrategy来配置，维护一个对Strategy对象的引用
 */
//上下文
public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 上下文接口
     */
    public void contextInterface() {
        strategy.algorithmInterface();
    }
}
