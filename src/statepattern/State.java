package statepattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 抽象状态类，定义一个接口以封装与Context的一个特定状态相关的行为。
 */
public abstract class State {
    public abstract void handle(Context context);
}


/**
 * 具体状态，每一个类实现一个与Context的一个状态相关的行为
 */
class ConcreteStateA extends State {

    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }

}

class ConcreteStateB extends State {

    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());

    }

}
