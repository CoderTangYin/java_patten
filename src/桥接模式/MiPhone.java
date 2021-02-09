package 桥接模式;

/**
 * MiPhone
 */
public class MiPhone implements Brand{

    @Override
    public void open() {
        // TODO Auto-generated method stub
        System.out.println("小米 开机");
    }

    @Override
    public void close() {
        // TODO Auto-generated method stub
        System.out.println("小米 关机");

    }

    @Override
    public void call() {
        // TODO Auto-generated method stub
        System.out.println("小米 打电话");

    }

    
}