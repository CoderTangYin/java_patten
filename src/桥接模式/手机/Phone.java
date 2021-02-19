package 桥接模式.手机;

/**
 * 手机  品牌+功能
 */
public abstract class Phone {

    // 手机的品牌
    private Brand brand;

    public Phone (Brand brand) {
        super();
        this.brand = brand;
    }

    protected void open() {
        brand.open();   
    }

    protected void close() {
        brand.close();
    }

    protected void call() {
        brand.call();
    }
}
