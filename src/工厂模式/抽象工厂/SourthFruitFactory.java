package 工厂模式.抽象工厂;

public class SourthFruitFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new SouthApple();
    }

    @Override
    public Fruit getPear() {
        return new SouthPear();
    }
}
