package 工厂模式.抽象工厂;

public class NorthApple extends Apple{
    @Override
    public void get() {
        System.out.println("采集北方苹果");
    }
}
