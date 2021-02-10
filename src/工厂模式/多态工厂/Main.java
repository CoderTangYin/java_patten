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


        /**
         *   根据上边的业务 这个时候如果再增加一种需要 如采集叶子
         *   这个时候只需要创建一个新的类 实现对应的接口就可以了
         *   不用修改里边的子类  实现了OCP原则
         */
    }
}
