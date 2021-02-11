package 访问者模式.公园权限分工;

public class Main {
    public static void main(String[] args) {

        // 被访问者公园
        Park park = new Park();

        // 访问者
        Visitor visitorA = new VisitorA();
        Visitor visitorB = new VisitorB();
        Visitor visitorVip = new VisitorVip();

        // 被访问者接受访问者
        park.accept(visitorA);
        park.accept(visitorB);
        park.accept(visitorVip);



    }
}
