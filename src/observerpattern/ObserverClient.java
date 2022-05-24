package observerpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class ObserverClient {
    public static void main(String[] args) {
        //创建Subject;
        ConcreteSubject s=new ConcreteSubject();

        //添加观察者X,Y,Z:    一对三
        s.attach(new ConcreteObserver(s,"X"));
        s.attach(new ConcreteObserver(s,"Y"));
        s.attach(new ConcreteObserver(s,"Z"));
        //设置主题状态
        s.setSubjectState("ABC");
        //更新
        s.notifyObserver();
    }
}
