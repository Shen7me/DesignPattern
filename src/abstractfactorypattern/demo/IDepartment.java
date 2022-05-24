package abstractfactorypattern.demo;

import abstractfactorypattern.demo.entity.Department;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
interface IDepartment {
    void insert(Department department);
    Department getDepartment(int id);
}

class SqlserverDepartment implements IDepartment
{

    @Override
    public void insert(Department department) {
        System.out.println("在SQLServer中给Department增加了记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在SqlServer中根据id得到Department的一条数据");
        return null;
    }
}


class AccessDepartment implements IDepartment
{

    @Override
    public void insert(Department department) {
        System.out.println("在Access中给Department增加了记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在Access中根据id得到Department的一条数据");
        return null;
    }
}
