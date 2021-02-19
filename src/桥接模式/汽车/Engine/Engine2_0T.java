package 桥接模式.汽车.Engine;

public class Engine2_0T implements Engine {

    @Override
    public void installEngine() {
        System.out.println("安装2.0T");
    }

    @Override
    public void fire() {
        System.out.println("2.0T打火");
    }

    @Override
    public void stopFire() {
        System.out.println("2.0Tx熄");

    }
}
