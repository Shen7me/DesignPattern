package flyweightpattern.demo;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */

/**
 * 网站外部状态 用户
 */
public class User {
    private String name;
    private String news;

    public String getName() {
        return name;
    }

    public String getNews() {
        return news;
    }

    public User(String name, String news) {
        this.name = name;
        this.news = news;
    }
}
