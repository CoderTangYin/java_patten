package 工厂模式.抽象工厂;

public class SouthApple extends Apple {
    @Override
    public void get() {
        System.out.println("采集南方苹果");
    }
}
