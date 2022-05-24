package decoratorpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public abstract class Decorator extends Component {
    protected Component component;

//    public Component getComponent() {
//        return component;
//    }

    //设置Component
    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }

}

class ConcreteDecoratorA extends Decorator {
    //ConcreteDecoratorA的独有功能属性
    private String addedState;

    @Override
    public void operation() {
        // 首先运行原Component的operation()，再执行本类的功能，如addedState，相当于对原Component进行了装饰
        super.operation();
        addedState = "A中的new state ";
        System.out.println(addedState + "具体装饰对象A的操作");
    }
}

class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }
    //新增方法
    public void addedBehavior() {
        System.out.print("B中的新增行为 ");
    }
}

class ConcreteDecoratorC extends Decorator {
    @Override
    public void operation() {
        super.operation();
        System.out.println("C没有特殊行为 " + "具体装饰对象C的操作");
    }

}
