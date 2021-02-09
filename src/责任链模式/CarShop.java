package 责任链模式;

public class CarShop {

    public static void main(String[] args) {

        CarMake body = new CarMakeBody();
        CarMake engine = new CarMakeEngine();
        CarMake test = new CarMakeTest();

        body.setNextMakeCarPart(engine);
        engine.setNextMakeCarPart(test);

        body.makeCarPart();

    }
}
