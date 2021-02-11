package 访问者模式.公园景区观光;

/**
 * 游客VIP持票可以访问整个公园景区
 */
public class VisitorVip implements Visitor {
    @Override
    public void visit(Park parkElement) {
        System.out.println("VIP 用户访问了VIP景区");
    }

    @Override
    public void visit(ParkElementA parkElementA) {
        System.out.println("VIP 用户访问了A景区");

    }

    @Override
    public void visit(ParkElementB parkElementB) {
        System.out.println("VIP 用户访问了B景区");
    }

}
