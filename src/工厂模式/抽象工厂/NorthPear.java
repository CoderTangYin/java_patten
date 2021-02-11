package 工厂模式.抽象工厂;

public class NorthPear extends Pear {
    @Override
    public void get() {
        System.out.println("采集北方梨");
    }
}
