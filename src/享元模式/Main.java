package 享元模式;

public class Main {

    public static void main(String[] args) {

        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite newsWebSite = webSiteFactory.getWebSite("news");
        newsWebSite.use(new User("tom"));

        WebSite blogWebSite = webSiteFactory.getWebSite("blog");
        blogWebSite.use(new User("tom1"));

        WebSite blogWebSite1 = webSiteFactory.getWebSite("blog");
        blogWebSite1.use(new User("tom2"));


        System.out.println(webSiteFactory.webSiteCount());

    }
}
