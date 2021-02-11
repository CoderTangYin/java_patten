package 工厂模式.抽象工厂;

public class Main {

    public static void main(String[] args) {

       Main.northInstance();
       Main.sourthInstance();

        /**
         *   这种工厂模式可以按着产品的类型划分
         *   如 苹果分为南北方  可以根据不同的需求生产不同的水果
         *   另外还包含了多态工厂的特效 再增加一种水果能够实现OCP
         *   原则
         *
         */

    }

    private static void sourthInstance() {
        FruitFactory fruitFactory = new SourthFruitFactory();
        Fruit apple= fruitFactory.getApple();
        apple.get();

        Fruit pear = fruitFactory.getPear();
        pear.get();
    }

    private static void northInstance() {
        FruitFactory fruitFactory = new NorthFruitFactory();
        Fruit apple= fruitFactory.getApple();
        apple.get();

        Fruit pear = fruitFactory.getPear();
        pear.get();
    }
}
