package 桥接模式.手机;

/**
 * 滑盖功能的手机
 */
public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        // TODO Auto-generated method stub
        super.open();
        System.out.println("滑盖手机 划开");

    }

    @Override
    protected void close() {
        // TODO Auto-generated method stub
        super.close();
        System.out.println("滑盖手机 关闭");

    }

    @Override
    protected void call() {
        // TODO Auto-generated method stub
        super.call();
        System.out.println("滑盖手机 打电话");

    }
}
