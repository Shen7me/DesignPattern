package adapterpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 球员           (Target)
 */
public abstract class Player {
    protected String name;
    public Player(String name)
    {
        this.name=name;
    }
    public abstract void attack();
    public abstract void defence();
}

//前锋
class Forwards extends Player{
    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋 "+name+" 攻击");
    }

    @Override
    public void defence() {
        System.out.println("前锋 "+name+" 攻击");
    }
}

//中锋
class Center extends Player{
    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中锋 "+name+" 攻击");
    }

    @Override
    public void defence() {
        System.out.println("中锋 "+name+" 攻击");
    }
}


//后卫
class Guards extends Player{
    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("后卫 "+name+" 攻击");
    }

    @Override
    public void defence() {
        System.out.println("后卫 "+name+" 防守");
    }
}