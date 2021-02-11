package 访问者模式.公园权限分工;

/**
 * 公园部分
 */
public class ParkElementB implements ParkElement {

    // 把B部分的权限提供给访问者
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
