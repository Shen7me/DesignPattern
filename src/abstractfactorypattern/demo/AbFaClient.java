package abstractfactorypattern.demo;

import abstractfactorypattern.demo.entity.Department;
import abstractfactorypattern.demo.entity.User;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class AbFaClient {
    public static void main(String[] args) {
        //new一个Department实体
        Department department=new Department();
        //设置该实体
        department.setId(1);

        //new一个User实体
        User user=new User();
        //设置该实体
        department.setId(1);


        //创建sqlserver工厂
        IFactory facsql=new SqlServerFactory();

        //得到sqlserver工厂的Department
        IDepartment sqldep=facsql.createDepartment();
        //在SQLServer中根据id=1  得到Department的一条数据
        sqldep.getDepartment(1);
        //在SQLServer中给Department增加了记录
        sqldep.insert(department);

        //得到sqlserver工厂的User
        IUser sqluser =facsql.createUser();
        //在SQLServer中根据id=1  得到User的一条数据
        sqluser.getUser(1);
        //在SQLServer中给User增加了记录
        sqluser.insert(user);


        //同理
        IFactory facacc=new AccessFactory();
        IDepartment accdep=facacc.createDepartment();
        accdep.getDepartment(1);
        accdep.insert(department);
        IUser accuser =facacc.createUser();
        accuser.getUser(1);
        accuser.insert(user);
    }
}
