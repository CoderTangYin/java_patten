package 访问者模式.公园权限分工;

/**
 * 游客B持票访问B景区
 */
public class VisitorB implements Visitor {
    @Override
    public void visit(Park parkElement) {

    }

    @Override
    public void visit(ParkElementA parkElementA) {

    }

    @Override
    public void visit(ParkElementB parkElementB) {
        System.out.println("游客B访问了B景区");
    }
}
