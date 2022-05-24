package compositepattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 具体公司      (Composite)
 */
public class ConcreteCompany extends Company{
    private List<Company>children=new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        for (int i=0;i<=depth;i ++)
            System.out.print("-");
        System.out.print(this.name);
        System.out.println();

        // 显示其枝节点名称，并对其下级进行遍历
        for (Company company : children) {
            company.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for(Company company :children)
        {
            company.lineOfDuty();
        }
    }
}
