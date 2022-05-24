package compositepattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 客户端。能通过Component接口操作组合部件的对象
 */
public class CompositeClient {
    public static void main(String[] args) {
        // 生成树根，根上长出两叶Leaf A和Leaf B
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        // 根上长出分支Composite X，分支上也有两叶Leaf X-A和Leaf X-B
        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf X-A"));
        comp.add(new Leaf("Leaf X-B"));
        root.add(comp);

        // 在Composite X上再长出分支Composite X-Y，分支上也有两叶Leaf X-Y-A和Leaf X-Y-B
        Composite comp2 = new Composite("Composite X-Y");
        comp2.add(new Leaf("Leaf X-Y-A"));
        comp2.add(new Leaf("Leaf X-Y-B"));
        comp.add(comp2);

        //根部又长出两叶LeafC和LeafD
        root.add(new Leaf("Leaf C"));
        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        //，可惜LeafD没长牢，飞走了
        root.remove(leaf);


        // 显示大树的样子
        root.display(1);
    }
}
