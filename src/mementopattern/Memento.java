package mementopattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class Memento {
    private String state;

    //构造方法，将相关数据导入
    public Memento(String state) {
        this.state = state;
    }

    //需要保存的数据
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
