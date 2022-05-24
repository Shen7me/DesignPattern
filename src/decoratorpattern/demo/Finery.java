package decoratorpattern.demo;


/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

//Finery类(Decorator)
public abstract class Finery extends Person {
    protected Person component;

    //打扮
    public void beBeautiful(Person component) {
        this.component = component;
    }

    @Override
    public void show()
    {
        if(component!=null)
        {
            component.show();
        }
    }
}

//下面是具体服饰
class TShirts extends Finery {
    @Override
    public void show() {
        System.out.print("短袖");
        super.show();
    }
}

class BigTrouser extends Finery {
    @Override
    public void show() {
        System.out.print("垮裤");
        super.show();
    }
}

class XZ extends Finery {
    @Override
    public void show() {
        System.out.print("西装");
        super.show();
    }
}

class Tie extends Finery {
    @Override
    public void show() {
        System.out.print("领带");
        super.show();
    }
}