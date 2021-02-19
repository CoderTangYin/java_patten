package 享元模式;


import java.util.HashMap;

// 网站工厂  根据需求返回网站
public class WebSiteFactory {

    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    // 根据网站类型返回一个网站 若没有则创建一个放进缓存中
    public WebSite getWebSite(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return (WebSite)pool.get(type);
    }

    // 获取网站分类总数
    public int webSiteCount() {
        return pool.size();
    }

}
