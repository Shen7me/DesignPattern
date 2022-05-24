package strategypattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 商场中搞促销活动，有三种情况：原价，打折，返利：
 */
public class CashClient {
    public static void main(String[] args) {
        CashContext cashContext;
        double Cash;

        //由于实例化不同的策略，所以得出的方法也不同

        cashContext = new CashContext(new CashNormal());
        Cash=cashContext.getResult(500);
        System.out.println(Cash);

        cashContext = new CashContext(new CashDiscount(0.7));
        Cash=cashContext.getResult(500);
        System.out.println(Cash);

        cashContext = new CashContext(new CashReturn(300,50));
        Cash=cashContext.getResult(500);
        System.out.println(Cash);
    }
}
