package statepattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * Context类，维护一个ConcreteState子类的实例，这个实例定义当前的状态
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state  ;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态："+state.getClass());
    }

    public void request() {
        this.state.handle(this);
    }
}
