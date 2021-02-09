package 责任链模式;

public abstract class CarMake {

    protected CarMake makeP;
    public void setNextMakeCarPart(CarMake makeP) {
        this.makeP = makeP;
    }

    public abstract void makeCarPart();
}
