package compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class Composite extends Component{
    //一个子对象集合，用来存储其下属的枝节点和叶节点
    private List<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        for (int i=0;i<=depth;i ++)
            System.out.print("-");
        System.out.print(this.name);
        System.out.println();

        // 显示其枝节点名称，并对其下级进行遍历
        for (Component component : children) {
            component.display(depth + 2);
        }

    }
}
