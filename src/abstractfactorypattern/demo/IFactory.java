package abstractfactorypattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
//Factory接口 ，定义一个创建访问User表对象的抽象的工厂接口
public interface IFactory {
    IUser createUser();
    IDepartment createDepartment();
}

class SqlServerFactory implements IFactory
{
    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlserverDepartment();
    }
}

class AccessFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}


