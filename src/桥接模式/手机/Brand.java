package 桥接模式.手机;

/**
 * Brand
 */
public interface Brand {
    // 手机的基本功能
    void open();
    void close();
    void call();
}