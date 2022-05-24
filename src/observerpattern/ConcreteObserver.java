package observerpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 具体观察者，实现抽象观察者角色所需要的更新接口，以便本身的状态与主题状态相协调
 * 具体观察者角色可以保存一个指向具体主题对象的引用。
 * 具体观察者角色通常用一个具体子类实现。
 */
public class ConcreteObserver extends Observer {

    private String name;
    private String observerState;
    private ConcreteSubject concreteSubject;

    public ConcreteObserver(ConcreteSubject concreteSubject, String name) {
        this.name=name;
        this.concreteSubject=concreteSubject;
    }

    @Override
    public void update() {
        observerState=concreteSubject.getSubjectState();
        System.out.println("观察者" + this.name + "的新状态是"
                + this.observerState);
    }

    public ConcreteSubject getConcreteSubject() {
        return concreteSubject;
    }

    public void setConcreteSubject(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }

}
