package 工厂模式.多态工厂;

public class Main {

    public static void main(String[] args) {

       //  获得苹果的抽象工厂 生产苹果  使用苹果
       AppleFactory appleFactory = new AppleFactory();
       Fruit apple = appleFactory.getFruit();
       apple.get();

       //
       PearFactory pearFactory = new PearFactory();
       Fruit pear = pearFactory.getFruit();
       pear.get();
    }
}
