package 享元模式;

public class ConcreteWebSite extends WebSite {

    // 网站的发布形似
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println(type + "网站" + user.getName());
    }
}
