package 装饰者模式.动物例子;

public abstract class Decorator implements ComponentAnimal{

    private ComponentAnimal componentAnimal;

    public Decorator(ComponentAnimal componentAnimal) {
        this.componentAnimal = componentAnimal;
    }

    @Override
    public void baseProperty() {
        componentAnimal.baseProperty();
    }

    public ComponentAnimal getComponentAnimal() {
        return componentAnimal;
    }
}
