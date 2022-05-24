package adapterpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

//外籍球员        Adaptee
public abstract class ForeignPlayer {
    //外籍球abstract class ForeignPlayer {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void jingong();
    public abstract void fangshou();
}

//外籍中峰
class ForeignCenter extends ForeignPlayer{

    @Override
    public void jingong() {
        System.out.println("中锋 "+name+" 攻击");
    }

    @Override
    public void fangshou() {
        System.out.println("中锋 "+name+" 防守");
    }
}
