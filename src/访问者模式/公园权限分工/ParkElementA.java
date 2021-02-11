package 访问者模式.公园权限分工;

/**
 * 公园A部分
 */
public class ParkElementA implements ParkElement {

    // 把A部分的权限提供给访问者
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
