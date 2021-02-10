package 工厂模式.简单工厂;

public class Main {

    public static void main(String[] args) {

        // 1. 创建工厂
        FruitFactory fruitFactory = new FruitFactory();
        // 2. 获得产品对象
        Fruit apple = fruitFactory.getApple();
        Fruit pear = fruitFactory.getPear();
        // 3. 使用产品
        apple.get();
        pear.get();
    }
}
