package 访问者模式.公园景区观光;

// 公园是个整体 包含A 跟 B
public class Park implements ParkElement{

    private ParkElementA parkElementA;
    private ParkElementB parkElementB;


    public Park() {
        this.parkElementA = new ParkElementA();
        this.parkElementB = new ParkElementB();
    }

    // 可以整体一起访问
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        parkElementA.accept(visitor);
        parkElementB.accept(visitor);
    }
}
