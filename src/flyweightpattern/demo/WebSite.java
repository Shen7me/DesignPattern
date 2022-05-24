package flyweightpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 网站抽象类
 */
public abstract class WebSite {
    public abstract void use(User user);
}

class ConcreteWebSite extends WebSite{
    private String type =null;

    public ConcreteWebSite(String type) {
        this.type = type;
    }


    @Override
    public void use(User user) {
        System.out.println("网站分类："+type+"\t用户："+user.getName()+"\t网站内容："+user.getNews());
    }
}

class UnshareConcreteWebSite extends WebSite{
    @Override
    public void use(User user) {
        System.out.print("不共享元的网站，我很特殊\t");
        System.out.println("用户："+user.getName()+"\t网站内容："+user.getNews());
    }
}
