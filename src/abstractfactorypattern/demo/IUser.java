package abstractfactorypattern.demo;

import abstractfactorypattern.demo.entity.User;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
interface IUser {
    void insert(User user);
    User getUser(int id);
}


class SqlserverUser implements IUser
{

    @Override
    public void insert(User user) {
        System.out.println("在SQLServer中给User增加了记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在SQLServer中根据id得到User的一条数据");
        return null;
    }
}


class AccessUser implements IUser
{

    @Override
    public void insert(User user) {
        System.out.println("在Access中给User增加了记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在Access中根据id得到User的一条数据");
        return null;
    }
}
