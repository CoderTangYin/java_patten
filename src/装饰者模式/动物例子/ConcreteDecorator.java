package 装饰者模式.动物例子;

public class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(ComponentAnimal componentAnimal) {
        super(componentAnimal);
    }

    @Override
    public void baseProperty() {
        super.baseProperty();
        bite();
    }

    @Override
    public String getName() {
        return null;
    }

    private void bite() {
        System.out.println(super.getComponentAnimal().getName() + "会咬人");
    }
}
