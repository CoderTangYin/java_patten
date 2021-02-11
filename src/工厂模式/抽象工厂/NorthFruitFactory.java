package 工厂模式.抽象工厂;

public class NorthFruitFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new NorthApple();
    }

    @Override
    public Fruit getPear() {
        return new NorthPear();
    }
}
