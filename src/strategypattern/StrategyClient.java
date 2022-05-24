package strategypattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */


public class StrategyClient {
        public static void main(String[] args) {
        Context context;

        //由于实例化不同的策略，所以得出的方法也不同

        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }
}
