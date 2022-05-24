package mementopattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class Originator {
    //相关属性，应该有多个，  是例子就写一个嘛
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //创建备忘录
    public Memento createMemento()
    {
        return (new Memento(state));
    }

    //方法()：显示数据
    public void setMemento(Memento memento)
    {
        state=memento.getState();
    }

    public void show()
    {
        System.out.println("state="+this.state);
    }
}
