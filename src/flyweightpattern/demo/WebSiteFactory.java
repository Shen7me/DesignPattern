package flyweightpattern.demo;
import java.util.HashMap;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class WebSiteFactory {
    //初始化工厂，生成若干实例
    private HashMap<String, WebSite> webSites = new HashMap<String, WebSite>();

    public WebSite getWebSiteType(String key) {
        if (!webSites.containsKey(key)) {
            webSites.put(key, new ConcreteWebSite(key));
        }

        return webSites.get(key);
    }
}
