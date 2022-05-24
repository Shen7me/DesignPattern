package decoratorpattern;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * ConcreteComponent是定义一个具体对象，可以给这个对象添加一些职责
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }

}
