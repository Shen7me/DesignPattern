package visitorpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

//访问者
public abstract class Action {
    //得到男人结论或反应
    public abstract void getManConclusion(Man concreteElementA);
    //得到女人结论或反应
    public abstract void getWomanConclusion(Woman concreteElementA);

}

//成功状态
class Success extends Action
{

    @Override
    public void getManConclusion(Man m) {
        System.out.println(m.getClass().getName()+this.getClass().getName()+"时，说：\"背后有一个伟大女人\"");
    }

    @Override
    public void getWomanConclusion(Woman w) {
        System.out.println(w.getClass().getName()+this.getClass().getName()+"时，说：\"背后有一个不成功的男人\"");

    }
}

//失败状态
class Failing extends Action
{

    @Override
    public void getManConclusion(Man w) {
        System.out.println(w.getClass().getName()+this.getClass().getName()+"时，说：\"闷头喝酒，谁也不用劝\"");

    }

    @Override
    public void getWomanConclusion(Woman m) {
        System.out.println(m.getClass().getName()+this.getClass().getName()+"时，说：\"眼泪汪汪，谁也劝不了\"");

    }
}

//恋爱状态
class Loving extends Action
{

    @Override
    public void getManConclusion(Man m) {
        System.out.println(m.getClass().getName()+this.getClass().getName()+"时，说：\"不懂装懂\"");

    }

    @Override
    public void getWomanConclusion(Woman w) {
        System.out.println(w.getClass().getName()+this.getClass().getName()+"时，说：\"懂也不懂\"");

    }
}