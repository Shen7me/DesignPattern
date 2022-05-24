package mementopattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class MementoClient {
    public static void main(String[] args) {
        // Originator初始状态,为On
        Originator originator = new Originator();
        originator.setState("On");
        originator.show();

        // 管理者通过备忘录保存状态，由于有了很好地封装，可以隐藏Originator的实现细节
        Caretaker careTaker = new Caretaker();
        careTaker.setMemento(originator.createMemento());

        // Originator改变状态，为Off
        originator.setState("Off");
        originator.show();

        // 通过管理者从备忘录中恢复状态
        originator.setMemento(careTaker.getMemento());
        originator.show();
    }
}
