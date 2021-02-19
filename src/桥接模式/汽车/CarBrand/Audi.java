package 桥接模式.汽车.CarBrand;

public class Audi implements CarBrand {
    @Override
    public void start() {
        System.out.println("Audi 开车");
    }

    @Override
    public void stop() {
        System.out.println("Audi 停车");

    }
}
