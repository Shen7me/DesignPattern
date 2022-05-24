package iteratorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class ConcreteAggregate extends Aggregate {

    //声明List泛型，用于存放聚合对象
    private List<Object> items=new ArrayList<Object>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count() {
        return items.size();
    }

    public Object getItems(int index) {
        return items.get(index);
    }

    public void setItems(Object item) {
        items.add(item);
    }

}
