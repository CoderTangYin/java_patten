package 工厂模式.简单工厂;

public class FruitFactory {

    public Fruit getApple() {
        return new Apple();
    }

    public Fruit getPear() {
        return new Pear();
    }
}
