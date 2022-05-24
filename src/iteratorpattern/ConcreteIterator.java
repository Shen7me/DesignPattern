package iteratorpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class ConcreteIterator extends Iterator{
    //定义了一个具体聚集对象
    private ConcreteAggregate aggregate;
    private int current =0;

    //初始化时，将具体聚集对象传入 ：  ”创建了个该聚集对象的迭代器“
    public ConcreteIterator(ConcreteAggregate a) {
        this.aggregate=a;
    }

    //聚集的第一个对象
    @Override
    public Object first() {
        return aggregate.getItems(0);
    }

    //聚集的下一个对象
    @Override
    public Object next() {
        Object ret=null;
        current++;
        if(current <aggregate.count())
        {
            ret = aggregate.getItems(current);
        }
        return  ret;
    }

    //是否结尾，是否结束
    @Override
    public boolean isDone() {
        return current >=aggregate.count()?true:false;
    }

    @Override
    public Object currentItem() {
        return aggregate.getItems(current);
    }
}
