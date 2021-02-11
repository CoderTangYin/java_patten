package 访问者模式.公园景区观光;

/**
 * 这一部分可以理解为公园的票
 *
 * 不同的票可以访问的区域不同
 */
public interface Visitor {
    public void visit(Park parkElement);
    public void visit(ParkElementA parkElementA);
    public void visit(ParkElementB parkElementB);

}
