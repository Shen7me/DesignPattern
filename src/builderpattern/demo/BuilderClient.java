package builderpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 客户不必知道具体的建造过程
 *
 * 咱们要做炒饭和炒面，为了让小厨师“标准化”的做饭，别忘了加盐！
 */
public class BuilderClient {
    public static void main(String[] args) {
        HeadChef director = new HeadChef();
        Cook c1 = new ChaoFan();
        Cook c2 = new ChaoMian();

        director.construct(c1);
        Lunch chaofan = c1.getResult();
        chaofan.show();

        director.construct(c2);
        Lunch chaomian = c2.getResult();
        chaomian.show();
    }
}
