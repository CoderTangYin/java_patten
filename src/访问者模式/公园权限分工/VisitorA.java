package 访问者模式.公园权限分工;

/**
 * 游客A持票访问A景区
 */
public class VisitorA implements Visitor {
    @Override
    public void visit(Park parkElement) {

    }

    @Override
    public void visit(ParkElementA parkElementA) {
        System.out.println("游客A访问了A景区");
    }

    @Override
    public void visit(ParkElementB parkElementB) {

    }
}
