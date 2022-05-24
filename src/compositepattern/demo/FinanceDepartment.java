package compositepattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class FinanceDepartment extends Company{

    public FinanceDepartment(String name) {
        super(name);
    }

    //叶子无添加删除
    @Override
    public void add(Company c) { }
    @Override
    public void remove(Company c) { }

    @Override
    public void display(int depth) {
        for (int i=0;i<=depth;i ++)
            System.out.print("-");
        System.out.print(this.name);
        System.out.println();
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name+"公司财务收支管理");
    }
}
