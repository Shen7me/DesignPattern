package factorymethodpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
//Hum     抽象Product类
public interface Hum{
    void make();
}


//具体产品类  HumA HumB
class HumA implements Hum {
    public HumA() {
        System.out.println("HumA，构造方法");
    }
    @Override
    public void make() {
        System.out.println("make HumA!");
    }
}

class HumB implements Hum {
    public HumB() {
        System.out.println("HumB，构造方法");
    }
    @Override
    public void make() {
        System.out.println("make HumB!");
    }
}