package 桥接模式.汽车.CarBrand;

public class BMW implements CarBrand{
    @Override
    public void start() {
        System.out.println("BMW 开车");

    }

    @Override
    public void stop() {
        System.out.println("BMW 停车");

    }
}
