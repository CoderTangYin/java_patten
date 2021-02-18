package 访问者模式.公园景区观光;

/**
 * 游客A持票访问A景区
 */
public class VisitorA implements Visitor {
    @Override
    public void visit(Park parkElement) {

    }

    // 访问A景区 并进行签到操作
    @Override
    public void visit(ParkElementA parkElementA) {
        System.out.println("游客A访问了A景区" + parkElementA.identify);
    }

    @Override
    public void visit(ParkElementB parkElementB) {

    }
}
