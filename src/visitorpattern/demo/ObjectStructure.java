package visitorpattern.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * "对象结构"设置该数据结构的方法
 */
public class ObjectStructure {
    private List<Person> elements=new ArrayList<>();

    //增加() ,
    public void attach(Person element)
    {
        elements.add(element);
    }

    //删除()
    public void detach(Person element)
    {
        elements.remove(element);
    }

    //显示()
    public void display(Action visitor)
    {
        for (Person e : elements)
        {
            e.accept(visitor);
        }
    }

}
