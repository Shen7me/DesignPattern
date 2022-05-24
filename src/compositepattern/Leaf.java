package compositepattern;


/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    //由于叶子没有再增加分枝和树叶，所以add和remove方法实现它没有意义，但
    //这样做可以消除叶节点和枝节点再抽象层次的区别，他们具备完全一致的接口。
    @Override
    public void add(Component component) {
        System.out.println("cannot add to a leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("cannot remove from a leaf");
    }

    //叶节点的具体方法
    @Override
    public void display(int depth) {
        // 通过“-”的数目显示级别
        for (int i=0;i<=depth;i ++)
            System.out.print("-");
        System.out.print(this.name);
        System.out.println();
    }
}
