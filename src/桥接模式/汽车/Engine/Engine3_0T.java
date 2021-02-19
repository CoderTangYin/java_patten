package 桥接模式.汽车.Engine;

public class Engine3_0T implements Engine {
    @Override
    public void installEngine() {
        System.out.println("安装3.0T");
    }
    @Override
    public void fire() {
        System.out.println("3.0T打火");
    }

    @Override
    public void stopFire() {
        System.out.println("3.0Tx熄");

    }
}
