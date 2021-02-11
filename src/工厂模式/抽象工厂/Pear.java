package 工厂模式.抽象工厂;

public abstract  class Pear implements Fruit {
    @Override
    public void get() {
        System.out.println("采集梨");
    }
}
