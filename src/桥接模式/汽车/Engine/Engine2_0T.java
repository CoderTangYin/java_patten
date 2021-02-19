package 桥接模式.汽车.Engine;

public class Engine2_0T implements Engine {

    @Override
    public void installEngine() {
        System.out.println("安装2.0T");
    }
}
