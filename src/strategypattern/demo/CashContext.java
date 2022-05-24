package strategypattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class CashContext {
    CashSuper cs;

    public CashContext(CashSuper cs) {
        this.cs = cs;
    }

    /**
     * 上下文接口
     */
    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}
