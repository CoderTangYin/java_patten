package 工厂模式.多态工厂;

public class Apple implements Fruit {
    @Override
    public void get() {
        System.out.println("采集苹果");
    }
}
