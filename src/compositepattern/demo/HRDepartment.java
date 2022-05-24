package compositepattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 人力资源部    (Leaf)
 */
public class HRDepartment extends Company{

    public HRDepartment(String name) {
        super(name);
    }

    //叶子无添加删除
    @Override
    public void add(Company c) {}
    @Override
    public void remove(Company c) {}

    @Override
    public void display(int depth) {
        for (int i=0;i<=depth;i ++)
            System.out.print("-");
        System.out.print(this.name);
        System.out.println();
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name+"员工招聘培训管理");
    }
}
