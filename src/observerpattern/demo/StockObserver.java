package observerpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class StockObserver extends Observer{
    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(sub.getSubjectState()+name+"关闭股票行情，继续工作！");
    }
}
