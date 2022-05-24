package decoratorpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

//Person类(ConcreteComponent)
public class  Person {
    public Person(){}

    private String name;
    public Person(String name)
    {
        this.name=name;
    }

    //在《大话设计模式》中这一个代码是虚函数，java自动实现虚函数
    public void show()
    {
        System.out.println("装扮"+name);
    }
}
