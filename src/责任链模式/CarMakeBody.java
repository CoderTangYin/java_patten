package 责任链模式;

public class CarMakeBody extends CarMake{
    @Override
    public void makeCarPart() {
        System.out.println("生产车身");
        if (this.makeP != null) {
            this.makeP.makeCarPart();
        }
    }
}
