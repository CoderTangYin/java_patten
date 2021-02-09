package 责任链模式;

public class CarMakeTest extends CarMake {
    @Override
    public void makeCarPart() {
        System.out.println("出厂前测试");
    }
}
