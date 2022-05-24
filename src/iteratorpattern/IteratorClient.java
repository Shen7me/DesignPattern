package iteratorpattern;


/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class IteratorClient {
    public static void main(String[] args) {
        ConcreteAggregate a=new ConcreteAggregate();
        a.setItems("零");
        a.setItems("111111");
        a.setItems(2);
        a.setItems(3.3333);
        class Four { }
        a.setItems(new Four());

        Iterator i = new ConcreteIterator(a);
        Object item=i.first();
        while(!i.isDone())
        {
            System.out.println(i.currentItem()+"  请买票！");
            i.next();
        }
    }




}
