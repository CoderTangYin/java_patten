package 桥接模式.手机;

/**
 * vivo
 */
public class VivoPhone implements Brand{

    @Override
    public void open() {
        // TODO Auto-generated method stub
        System.out.println("Vivo 开机");
    }

    @Override
    public void close() {
        // TODO Auto-generated method stub
        System.out.println("Vivo 关机");

    }

    @Override
    public void call() {
        // TODO Auto-generated method stub
        System.out.println("Vivo 打电话");

    }
}
