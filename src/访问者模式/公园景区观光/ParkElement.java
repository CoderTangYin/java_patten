package 访问者模式.公园景区观光;

/**
 * 这一部分可以理解公园的大门口 接受外界来的游客
 */
public interface ParkElement {
    // 接待访问者的  把访问者传递进去
    // 公园提供权限给访问者访问
    public void accept(Visitor visitor);
}
