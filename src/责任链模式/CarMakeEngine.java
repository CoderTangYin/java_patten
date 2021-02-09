package 责任链模式;

public class CarMakeEngine extends CarMake{
    @Override
    public void makeCarPart() {
        System.out.println("生产发动机");
        if (this.makeP != null) {
            makeP.makeCarPart();
        }
    }
}
