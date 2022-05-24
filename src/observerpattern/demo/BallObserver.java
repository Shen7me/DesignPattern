package observerpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class BallObserver extends Observer{

    public BallObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(sub.getSubjectState()+name+"关闭球赛网页，继续工作！");

    }
}
